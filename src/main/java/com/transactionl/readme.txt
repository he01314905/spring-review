Spring要去實現事務有分兩種

1.編程式事務
通過編寫程式碼實現事務的管理
Spring對事務管理底層是基於AOP實現,採用AOP封裝,所以Spring對事物開發了一套API,核心介面:

PlatformTransactionManager介面: 他有兩個實現

DataSourceTransactionManager:支持 JdbcTemplate,MyBatis,Hibernate等
JtaTransactionManager:支持分布式管理
Spring6使用JdbcTemplate,要使用DataSourceTransactionManager(Spring內建寫好了,可以直接用)

2.聲明式事務 (1)注解式 (2)xml配置
這邊利用jdbcTemplate示範

---(半註解 半xml)---

需要配置bean 
<bean id="txManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
<property name="dataSource" ref="dataSource(你的數據源需有配置)"/>
</bean>
需要註解驅動器
<tx:annotation-driven transaction-manager="txManager"/>

tx命名空間須像context命名空間一樣新增

---(全註解式)---

寫一個Class 有@Configuration @ComponentScan("要掃描的包") @EnableTransactionManagement 開啟事務註解
並且裡面要有@Bean這個聲明  測試程式 原先的ClassPathXmlApplicationContext 要改成 AnnotationConfigApplicationContext

---(配置xml方式)---

半註解半xml配置方式 最下面的 tx 註解驅動器改掉 變成Aop的方式進行 配通知 指定事務要管理的方法 配切面切點 

@Transation內有  
傳播行為 propagation,隔離級別 Isolation
超時時間 timeout 默認-1 不限時
rollbackFor 發生什麼事務回滾 noRollbackFor 發生什麼不回滾

@Transation(propagation = Propagation.REQUIRED)
propagation內有七種屬性(Spring內以枚舉類型存在)
REQUIRED (預設) 沒有事務就新建 有的話就在原事務中進行
SUPPORTS  有就加入,沒有就不管
MANDATORY 有就加入,沒有就拋出異常
REQUIRES_NEW 不管有沒有,開啟新事物(原事務先暫停)
NOT_SPPORTED 不支持事務,暫停原事務,執行當前程式
NEVER 不支持事務,有事務就拋出異常
NESTED 有事務就在事務內在嵌套一個獨立事務,獨立事務可以自行提交回滾,沒有事務就與REQUIRED一樣

Isolation有四個隔離級別(也是枚舉類型)
@Transation(isolation = Isolation.DEFAULT)
DEFAULT 預設(隔離級別指下面四種)
READ_UNCOMMITTED
READ_COMMITTED (Oracle資料庫預設)
REPEATABLE_READ (MySQL資料庫預設)
SERIALIZABLE

髒讀:讀到尚未提交的數據(讀緩存)   不可重複讀:同一事務中 第一次跟第二次讀到不一樣的數據 幻讀: 讀到假的數據  
		髒讀    不可重複讀  幻讀
讀未提交	yes      yes     yes
讀提交   	No       yes     yes
可重複讀 	No       No      yes
序列化  	No       No      No   (級別最高 不支持併發,排隊,效率最低)

timeout 的時間 是指 事務中所有DML語句在超時時間內未完成的話事務回滾   
當前事務,最後一句DML語句執行之前的時間 後面非DML語句,例如: 業務邏輯的程式碼 不算在超時時間

