package chapter04.product.impl;

import java.util.ArrayList;

import chapter04.condition.impl.CareCondition;
import chapter04.condition.impl.DeathLifeCondition;
import chapter04.condition.impl.PaymentExemptioncCondition;
import chapter04.condition.impl.SurgeryCondition;
import chapter04.product.Product;

public class BankCancerProduct extends Product{
	public BankCancerProduct(){
		name = "방카 시그니처 암 보험";
		paymentPeriod = "월납";
		updateType = "갱신형";
		discountType = "표준체";
		saleEndYmd = "20230601";
		specialConditons.add(new SurgeryCondition());
		specialConditons.add(new CareCondition());
		specialConditons.add(new DeathLifeCondition());
		specialConditons.add(new PaymentExemptioncCondition());

	}
	
	public void event(){
		System.out.println("★★롯데백화점 상품권 5천원 제공★★");
	}
}
