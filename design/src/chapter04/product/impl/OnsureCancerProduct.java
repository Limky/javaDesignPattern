package chapter04.product.impl;

import java.util.ArrayList;
import java.util.List;

import chapter04.condition.Condition;
import chapter04.factorty.impl.OnsureProductPropertyFactory;
import chapter04.product.Product;

public class OnsureCancerProduct extends Product{
	
	OnsureProductPropertyFactory propertyFactory;
	
	public OnsureCancerProduct(OnsureProductPropertyFactory propertyFactory){
		this.propertyFactory = propertyFactory;

	}
	
	public void prepare(){
		name = "온슈어 시그니처 암 보험";
		saleEndYmd = "20220701";
		paymentPeriod = "월납";
		updateType = "비갱신형";
		discountType = "건강체";
		
		System.out.println("상품명 : " + name);
		System.out.println("납입기간 불러오기...");
		System.out.print("상품 고정 특약 : ");
		
		//추상 팩토리 패턴..
		specialConditons = propertyFactory.createCondition();
		
		for (Condition conditions : specialConditons) {
			System.out.print(conditions.getConditionName() + ",");
		}
		System.out.println();
		
	}
	
	public void event(){
		System.out.println("★★시그니처 암보험 가입시 스타벅스 아이스아메리카노 1잔 제공★★");
	}
}
