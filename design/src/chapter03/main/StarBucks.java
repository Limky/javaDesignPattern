package chapter03.main;

import chapter03.decorator.Whip;
import chapter03.decorator.Mocha;
import chapter03.form.Beverage;
import chapter03.form.Espresso;
/*
 데코레이터 패턴..
슈퍼클래스는 추상클래스이며, 추상메소드를 정의하여
각 서브클래스에서 재정의해서 쓰도록 하였다.

각 요건들이 조합되어 하나의 요건이 생기는 경우
요건은 기하급수적으로 늘어난다. 

즉, 조합된 요건마다 서브클래스는 기하급수적으로 늘 것이다.

3개의 조합은 3x2x1 = 6가지이다.

대안1) 인스턴스 변수와 슈퍼클래스 상속을 써서 관리해보자.
첨가물이 추가 수정될때마다 슈퍼클래스의 첨가물 인스턴수 변수의
값을 수정해주어야하고, 슈퍼클래스의 메소드를 수정해야한다.

또한, 조합된 요건에 상관없는(필요없는) 메소드까지 상속받게 된다.
같은 요건을 중복해서 새로운 요건으로 만드는 경우(더블모카)
요건을 충족시키기 어렵다.
*/
public class StarBucks {

	public static void main(String[] args) {
	
		Beverage beverage = new Espresso();
		
		System.out.println(beverage.getDescription() + " $"+beverage.cost());
		
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		
		System.out.println(beverage.getDescription() + " $"+beverage.cost());

	}

}
