Aop七大用語

1.連接點Joinpoint 方法前後的位置
2.切點 PointCut 程式執行流程中,真正織入切面的方法
3.通知Advice 又叫做增強,具體要織入的程式碼
通知包括 1.前置通知(切點前) 2. 後置通知(切點後) 3.環繞通知(切點前後皆有) 4. 異常通知(拋出異常後) 5.最終通知(finally後)
4.切面Aspect 切點+通知
5.織入Weaving 通知應用到目標對象的過程
6.代理對象Proxy 一個目標對象被織入通知後產生的新對象
7.目標對象Target 被織入通知的對象

切點表達式

execution([訪問修飾符]返回值類型[全限定類名]方法名(形式參數列表)[異常])
[]表示可選填
訪問修飾符 沒寫表示所有權限,寫public代表只包含公開方法
返回值類型 * 表示返回值類型任意
全限定類名 ..代表當前包及其子包下所有類 省略代表所有類
方法名 *表示所有方法 set*表示所有set方法
形式參數列表 ()代表沒有參數的方法 (..)參數類型和個數隨意的方法 (*)只有一個參數的方法

配置要再切面的Class上 @Aspect
@Before 前置  @AfterReturning 後置 @Around 環繞(有其他通知會在最前跟最後) 
@AfterThrowing 異常 @After 最終

@PointCut定義通用切點表達式--這樣@內的("方法名")如果在不同類想使用則要+上前面的包及類
有多個切面 由 @Order() 內的數字決定 越小優先級越高
