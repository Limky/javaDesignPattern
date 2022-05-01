package chapter01.strategy.impl;

import chapter01.strategy.QuackBehavior;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("»ß");
	}
	
}
