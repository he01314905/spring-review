Spring6對Junit4的支持
單元測試 

在pom.xml 加入
spring-test  及 junit配置

<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>3.8.1</version>
</dependency>

<dependency>
<groupId>org.springframework</groupId>
<artifactId>spring-test</artifactId>
<version>6.1.14</version>
</dependency>
版本號會變更

以往要自行編寫
ApplicationContext app = ClassPathXmlContext("名稱.xml")
然後getBean

註解式
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:名稱.xml")
class上

然後內部可以private 類型 名稱; 要呼叫的bean 利用Autowired注入 方法內直接呼叫方法

Junit5

<dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter</artifactId>
<version>5.9.0</version>
<scope>test</scpoe>
</dependency>

註解式
@ExtenWith(SpringExtension.class)  原先4 是 RunWith  其餘的與4同樣
