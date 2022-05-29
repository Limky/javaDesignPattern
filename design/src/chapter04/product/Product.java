package chapter04.product;

import java.util.ArrayList;

import chapter04.condition.Condition;

public abstract class Product {

	public String name; //상품명
	public String paymentPeriod; //납입기간
	public String updateType; //갱신형태
	public String discountType; //할인형태
	public String saleEndYmd; //판매종료일
	public ArrayList<Condition> specialConditons = new ArrayList<>(); //특별약관

	//판매가능여부 체크
	public void isPossableSale(){
		System.out.println("판매가능여부 체크 (" + saleEndYmd + ")");
	}
	
	//상품설계 준비
	public void prepare(){
		System.out.println("상품명 : " + name);
		System.out.println("납입기간 불러오기...");
		System.out.print("상품 고정 특약 : ");
		for (Condition conditions : specialConditons) {
			System.out.print(conditions.getConditionName() + ",");
		}
		System.out.println();
	}

	//이벤트 제공
	public void event(){
		System.out.println("이벤트 없음..");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPaymentPeriod() {
		return paymentPeriod;
	}

	public void setPaymentPeriod(String paymentPeriod) {
		this.paymentPeriod = paymentPeriod;
	}

	public String getUpdateType() {
		return updateType;
	}

	public void setUpdateType(String updateType) {
		this.updateType = updateType;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}


	@Override
	public String toString() {
		
		StringBuffer display = new StringBuffer();
		display.append(" < "+ name + " > \n");
		display.append(paymentPeriod + "\n");
		display.append(updateType + "\n");
		display.append(discountType + "\n");
		display.append(saleEndYmd + "\n");
		
		for (Condition conditions : specialConditons) {
			display.append(conditions.getConditionName() + "\n");
		}
		System.out.println();
		
		return display.toString();
	}
	
	
	
}
