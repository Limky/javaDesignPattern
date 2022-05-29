package chapter04.channel.impl;

import chapter04.channel.Channel;
import chapter04.factorty.impl.OnsureProductPropertyFactory;
import chapter04.product.Product;
import chapter04.product.impl.OnsureCancerProduct;
import chapter04.product.impl.OnsurePensionProduct;

public class OnsureChannel extends Channel{

	@Override
	protected Product offerProduct(String type) {
		
		if(type.equals("Cancer")){
			return new OnsureCancerProduct(new OnsureProductPropertyFactory());
		}else if(type.equals("Pension")){
			return new OnsurePensionProduct();
		}else return null;
	}

}
