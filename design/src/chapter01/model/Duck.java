package chapter01.model;

import chapter01.strategy.FlyBehavior;
import chapter01.strategy.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("��� ������ ���� ��ϴ�. ��¥������ ����");
	}
	
	//�������� ������ ������ �� ����
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	
	//�������� ������ ������ �� ����
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
	
	
}
