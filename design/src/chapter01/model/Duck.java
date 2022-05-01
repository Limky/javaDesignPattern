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
		System.out.println("모든 오리는 물에 뜹니다. 가짜오리도 뜨죠");
	}
	
	//동적으로 전략을 주입할 수 있음
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	
	//동적으로 전략을 주입할 수 있음
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
	
	
}
