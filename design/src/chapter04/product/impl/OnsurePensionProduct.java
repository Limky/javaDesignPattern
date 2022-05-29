package chapter04.product.impl;

import java.util.ArrayList;

import chapter04.condition.impl.DeathLifeCondition;
import chapter04.product.Product;

public class OnsurePensionProduct extends Product{
	public OnsurePensionProduct(){
		name = "온슈어 노후까지 책임지는 연금보험";
		paymentPeriod = "무조건 일시납";
		updateType = "비갱신형";
		discountType = "표준체";
		saleEndYmd = "20221201";
		
		specialConditons.add(new DeathLifeCondition());

	}
	
}
