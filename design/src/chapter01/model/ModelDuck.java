package chapter01.model;

import chapter01.strategy.impl.FlyNoWay;
import chapter01.strategy.impl.Quack;

public class ModelDuck extends Duck{

	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("���� ���� �����Դϴ�.");
	}
	

}
