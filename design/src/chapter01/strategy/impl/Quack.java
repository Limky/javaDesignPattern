package chapter01.strategy.impl;

import chapter01.strategy.QuackBehavior;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Ва");
	}
	
}
