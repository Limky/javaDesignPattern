package chapter01.strategy.impl;

import chapter01.strategy.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Á¶¿ë~~");
	}

}
