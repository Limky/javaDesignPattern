package chapter01.strategy.impl;

import chapter01.strategy.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("���� �� ���ƿ�");
	}

}
