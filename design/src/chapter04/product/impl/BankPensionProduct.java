package chapter04.product.impl;

import java.util.ArrayList;

import chapter04.condition.impl.DeathLifeCondition;
import chapter04.product.Product;

public class BankPensionProduct extends Product{
	public BankPensionProduct(){
		name = "방카 죽을때까지 책임지는 연금보험";
		paymentPeriod = "연납";
		updateType = "갱신형";
		discountType = "표준체";
		saleEndYmd = "20221201";
		
		specialConditons.add(new DeathLifeCondition());

	}
	
	public void event(){
		System.out.println("★★이디아 커피종류 1잔 제공★★");
	}
	
}
