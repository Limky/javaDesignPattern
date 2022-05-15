package chapter03.decorator;

import chapter03.form.Beverage;

public abstract class CondimentDecorator extends Beverage{

	Beverage beverage;
	public abstract String getDescription();
}
