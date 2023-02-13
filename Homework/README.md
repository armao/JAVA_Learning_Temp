利用課堂教學之Java類別、繼承、界面、多型、抽象方法、等物件導向方式，完成以下程式功能程式之設計：

1.	設計一個類別「HourlyEmployee」，繼承Employee，實作Payable界面，用以表示時薪員工，並具備基礎錯誤參數檢查的建構式與服務方法功能。
	需要實作「getPaymentAmount」方法，代表取得應付金額的功能。
	需要實作「wage」、「hours」屬性以及屬性的取得、設定服務方法。
	需要實作「HourlyEmployee」方法，代表類別建構式。
	請覆寫「toString」方法，提供顯示時薪的功能。

2.	設計一個類別階層「Commission Employee」、「BasePlusCommissionEmployee」，繼承Employee，實作Payable界面，用以表示佣金員工及底薪加佣金員工，並具備基礎錯誤參數檢查的建構式與服務方法功能。
	需要分別為「Commission Employee」、「BasePlusCommissionEmployee」實作「getPaymentAmount」方法，代表取得應付金額的功能。
	需要分別實作「grossSales」、「commissionRate」、「baseSalary」屬性以及屬性的取得、設定服務方法。
	需要分別實作「CommissionEmployee」、「BasePlusCommissionEmployee」方法，代表類別建構式。
	請分別覆寫「toString」方法，提供顯示薪水的功能。

3.	設計一個類別「InterfacePayableTest」，具備程式進入點Main()功能，利用Payable界面、多型的處理各種「Employee」、「Invoice」子類別。
	至少需要內含二個Invoice實體物件。
	至少需要內含一個HourlyEmployee實體物件。
	至少需要內含一個SalariedEmployee實體物件。
	至少需要內含一個Commission Employee、一個BasePlusCommission Employee實體物件，並將CommissionEmployee之獎金比提高50%。
	請利用toString、getPaymentAmount方法，進行Payable界面多型呼叫。
