package chapter04.main;

import chapter04.channel.Channel;
import chapter04.channel.impl.BankChannel;
import chapter04.channel.impl.OnsureChannel;
import chapter04.product.Product;

public class ContractMain {

	public static void main(String[] args) {
		System.out.println("-------ContractMain------");
		Channel onsure = new OnsureChannel();
		Channel ba = new BankChannel();
		
		Product product = onsure.joinProduct("Cancer");
		System.out.println("▶▶온슈어에서 가입시도한" + product.toString());
		
		product = ba.joinProduct("Pension");
		System.out.println("▶▶은행채널에서 가입시도한" + product.toString());

		
		/*
			-------ContractMain------
			상품명 : 온슈어 시그니처 암 보험
			납입기간 불러오기...
			상품 고정 특약 : 수술비 특약,간병비 특약,
			판매가능여부 체크 (20220701)
			★★시그니처 암보험 가입시 스타벅스 아이스아메리카노 1잔 제공★★
			
			▶▶온슈어에서 가입시도한 < 온슈어 시그니처 암 보험 > 
			월납
			비갱신형
			건강체
			20220701
			수술비 특약
			간병비 특약
			
			상품명 : 방카 죽을때까지 책임지는 연금보험
			납입기간 불러오기...
			상품 고정 특약 : 종신 특약,
			판매가능여부 체크 (20221201)
			★★이디아 커피종류 1잔 제공★★
			
			▶▶은행채널에서 가입시도한 < 방카 죽을때까지 책임지는 연금보험 > 
			연납
			갱신형
			표준체
			20221201
			종신 특약
	 
		 
		 */
		
	}

}
