Bean生命週期五步:
第一步: 實例化Bean
第二步: Bean屬性賦值
第三步: 初始化Bean
第四步: 使用Bean
第五步: 銷毀Bean

Bean生命週期七步: 多兩步在初始化前跟後
第一步: 實例化Bean
第二步: Bean屬性賦值
第三步: 執行"Bean後處理器的Before方法"
第四步: 初始化Bean
第五步:執行"Bean後處理器的After方法"
第六步: 使用Bean
第七步: 銷毀Bean

Bean生命週期十步: 七步後+三步
點位1: "Bean後處理器"before方法之前
	檢查Bean是否實現了Aware相關介面,如果實現了就調用這些介面中的方法,主要為傳遞一些數據
	
點位2: "Bean後處理器"before方法之後
	檢查Bean是否實現了InitializingBean介面,如果實現了就調用方法
	
點位3: 銷毀Bean之前 或者說使用Bean之後
	檢查Bean是否實現了DisposableBean介面,如果實現就調用方法
	
三個點位特點:都是在檢查這個Bean是否實現了某些特定介面,如果有實現則調用介面中方法