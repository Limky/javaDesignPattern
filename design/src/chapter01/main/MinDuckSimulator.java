package chapter01.main;

import chapter01.model.Duck;
import chapter01.model.MallardDuck;
import chapter01.model.ModelDuck;
import chapter01.strategy.impl.FlyRocketPowered;


public class MinDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered()); //동적으로 전략 주입 가능
		model.performFly();
		
	}

}
