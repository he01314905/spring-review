package myspring.core;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassPathXmlApplicationContext implements ApplicationContext{
	private static final Logger logger =LoggerFactory.getLogger(ClassPathXmlApplicationContext.class);
	private Map<String,Object> singletonObjects=new HashMap<>();
	/*
	 * 解析myspring 配置文件
	 * 初始化所有bean對象
	 * configLocation 就是路徑
	 * */
	public ClassPathXmlApplicationContext(String configLocation) {
		try {
			//解析myspring.xml文件,實例化對象,將對象放入map集合中
			//dom4j解析xml文件的核心對象
			SAXReader reader = new SAXReader();
			//獲取一個輸入流,指向配置文件(ResourceAsStream只能從類路徑加載 resource)
		InputStream in=	ClassLoader.getSystemClassLoader().getResourceAsStream(configLocation);
		//讀取文件
		Document document=	reader.read(in);
			//獲取所有bean標籤 加兩個//獲取所有的
		List<Node> nodes =document.selectNodes("//bean");
		//遍歷bean標籤
		nodes.forEach(node ->{
			try {
			//	System.out.println(node);
				Element element = (Element)node;
				//獲取id屬性
				String id = element.attributeValue("id");
				String className =element.attributeValue("class");
				
				logger.info("beanName="+id);
				logger.info("beanClassName="+className);
				
				Class<?> aClass = Class.forName(className);
				Constructor<?> con  =aClass.getDeclaredConstructor();
				Object bean = con.newInstance();
				singletonObjects.put(id,bean);
				logger.info(singletonObjects.toString());
			}catch(Exception e) {
				e.printStackTrace();
			}
			});
		
		nodes.forEach(node ->{
			try {
				Element element = (Element)node;
				
				String id = element.attributeValue("id");
				
				String className =element.attributeValue("class");
				
				Class<?> clazz = Class.forName(className);
				
				//獲取該bean標籤下所有屬性property標籤
				List<Element> properties=   element.elements("property");
				properties.forEach(property ->{
					try {
						//獲取屬性名	
						String propertyName=property.attributeValue("name");
						//獲取屬性名
						Field field = clazz.getDeclaredField(propertyName);
						logger.info("propertyName="+propertyName);
						//獲取set方法名
						String setMethodName="set"+propertyName.toUpperCase().charAt(0)+propertyName.substring(1);
						Method setMethod = clazz.getDeclaredMethod(setMethodName, field.getType());
						String value =property.attributeValue("value");
						Object actualValue=null;
						String ref =property.attributeValue("ref");
						if(value != null) {
							//說明這個值是簡單類型
							//這裡只處理8種基本型別及其包裝型別+String
							//先獲取屬性類型名
							String propertyTypeName = field.getType().getSimpleName();
							switch(propertyTypeName) {
							case "byte": 
								actualValue=Byte.parseByte(value);
								break;
							case "short":
								actualValue=Short.parseShort(value);
								break;
							case"int":
								actualValue=Integer.parseInt(value);
								break;
							case"long":
								actualValue=Long.parseLong(value);
								break;
							case"boolean":
								actualValue=Boolean.parseBoolean(value);
								break;
							case"float":
								actualValue=Float.parseFloat(value);
								break;
							case"char":
								actualValue= value.charAt(0);
								break;
							case"double":
								actualValue=Double.parseDouble(value);
								break;
							case"Byte":
								actualValue=Byte.valueOf(value);
								break;
							case"Short":
								actualValue=Short.valueOf(value);
								break;
							case"Integer":
								actualValue=Integer.valueOf(value);
								break;
							case"Long":
								actualValue=Long.valueOf(value);
								break;
							case"Boolean":
								actualValue=Boolean.valueOf(value);
								break;
							case"Float":
								actualValue=Float.valueOf(value);
								break;
							case"Character":
								actualValue=Character.valueOf(value.charAt(0));
								break;
							case"Double":
								actualValue=Double.valueOf(value);
								break;
							case"String":
								actualValue=value;
							}
							setMethod.invoke(singletonObjects.get(id), actualValue);
						}
						if(ref != null) {
							//說明這個值是非簡單類型
							setMethod.invoke(singletonObjects.get(id), singletonObjects.get(ref));
						}
						
						
					}catch(Exception e) {
						e.printStackTrace();
					}
				});
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		});
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Object getBean(String beanName) {
		// TODO Auto-generated method stub
		return singletonObjects.get(beanName);
	}

}
