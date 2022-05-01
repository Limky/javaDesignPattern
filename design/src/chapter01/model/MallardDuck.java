package chapter01.model;

import chapter01.strategy.impl.FlyWithWings;
import chapter01.strategy.impl.Quack;

public class MallardDuck extends Duck{

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("저는 물 오리입니다.");
	}

	
}
