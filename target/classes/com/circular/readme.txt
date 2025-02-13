Singleton + setter 模式下的循環依賴是沒有任何問題的

為什麼循環依賴不會出現,Spring如何應對?
主要是,這種模式下Spring對Bean的管理主要分為兩階段:
第一個階段: 在Spring容器加載的時候,實例化Bean,只要其中任意一個Bean實例化,馬上進行"曝光"【不等於屬性賦值】
第二個階段: Bean"曝光"之後,在進行屬性的賦值(調用set方法)

核心解決方案: 實例化對象和對象之間的屬性賦值分為兩階段完成


Prototype + setter 
當兩個bean都是prototype時會有BeanCurrentlyInCreationException異常
每次呼叫都會實例化新的對象,對象內呼叫的對象又創建新的對象,導致循環
如果其中一個對象的作用域為singleton 那就沒有問題


如果是建構子注入的話會無法賦值
setter注入在創建時就會曝光所以之後可以賦值,但建構子需要都創建完後才能賦值


DefaultSingletonBeanRegistry 類中 比較重要的三個緩存:
private final Map<String, Object> singletonObjects             		一級緩存
private final Map<String, Object> earlySingletonObjects				二級緩存
private final Map<String, ObjectFactory<?>> singletonFactories		三級緩存

三者皆為Map集合
key儲存的都是bean的name(bean id)
一級緩存存儲的是: 完整的單例Bean對象,也就是說這個緩存中的Bean對象都已經賦值了,一個完整Bean對象
二級緩存存儲的是: 早期的單例Bean對象,這裡的Bean對象的屬性尚未賦值,只是一個早期的實例對象
三級緩存存處的是: 單例工廠對象,這裡儲存大量"工廠對象",每一個單例Bean對象都會對應一個單例工廠對象
這個集合存的是,創建該單例對象時對應的那個單例工廠對象
