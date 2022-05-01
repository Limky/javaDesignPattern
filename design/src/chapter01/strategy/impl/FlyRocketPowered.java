package chapter01.strategy.impl;

import chapter01.strategy.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("로켓 추진으로 날아갑니다");
	}

}
