package chapter04.channel;

import chapter04.product.Product;

public abstract class Channel {
	public Product joinProduct(String type){
		Product product;
		
		product = offerProduct(type);
		product.prepare();
		product.isPossableSale();
		product.event();

		return product;
	}
	
	protected abstract Product offerProduct(String type);
}
