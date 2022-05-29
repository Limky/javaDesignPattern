package chapter04.channel.impl;

import chapter04.channel.Channel;
import chapter04.product.Product;
import chapter04.product.impl.BankCancerProduct;
import chapter04.product.impl.BankPensionProduct;

public class BankChannel extends Channel{

	@Override
	protected Product offerProduct(String type) {
		
		if(type.equals("Cancer")){
			return new BankCancerProduct();
		}else if(type.equals("Pension")){
			return new BankPensionProduct();
		}else return null;
	}

}
