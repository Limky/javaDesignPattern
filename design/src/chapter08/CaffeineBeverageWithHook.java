package chapter08;

public abstract class CaffeineBeverageWithHook {
	
	//★★템플릿메서드!!★★
	//1-1. 비슷하지만, 다른..다르지만 비슷한 서브클래스들의 알고리즘을 여기서 일방적으로 관리한다! 
	//1-2. 각 서브클래스들의 알고리즘을 관리할 수 있는 이유는 결국 큰 프로세스(동작 흐름)이 동일하기 때문
	//2-1. 알고리즘 내부에서는 각 서브클래스들의 공통적인 부분을 일반화하여 슈퍼클래스에서 구현한 메서드를 호출하기도 하고
	//2-2. 공통적이지 않은 부분은 각 서브클래스에서 재정의 구현한 추상메서드를 호출하기도 한다. 
	//* 템플릿메서드 final : 템플릿 메서드에 final을 선언하여 오버라이딩 방지(why? 알고리즘은 슈퍼클래스에서 일방적으로 관리하기 위함)
	//* 할리우드 원칙 : 서브클래스에서 슈퍼클래스 메서드를 호출하기도다, 해당 템플릿 메서드에서 각 서브클래스 메소드를 호출한다.
	final void prepareRecipe(){
		boilWater();//공통적으로 물을 끓여요. 일반화해서 공통적인 부분을 구현한 메서드에요, 따라서 슈퍼클래스에서 구현해요.
		brew();//서브클래스에서 구현해요. 슈퍼클래스는 아무것도 몰라요.
		pourInCup();//공통적으로 물을 끓여요. 일반화해서 공통적인 부분을 구현한 메서드에요, 따라서 슈퍼클래스에서 구현해요.
		
		//hook메서드로 사용자가 첨가물을 별도로 요청했는지 체크하고 첨가물 추가한다!
		if(customerWantsCondiments()){
			addCondiments(); //서브클래스에서 구현해요. 슈퍼클래스는 아무것도 몰라요.
		}
	}

	//서브클래스에서 자기 입맛, 취향에 따라 재정의하여 사용해야하기 때문에 추상메서드로 구현!!
	abstract void brew();
	abstract void addCondiments();
	
	//해당 알고리즘에서 공통적으로 사용한다!! 일반화로 공통적인 부분을 빼옴!
	void boilWater(){
		System.out.println("물 끓이는 중...");
	}
	
	//해당 알고리즘에서 공통적으로 사용한다!! 일반화로 공통적인 부분을 빼옴!
	void pourInCup(){
		System.out.println("컵에 따르는 중~");
	}
	
	//hook 메서드
	//쓸거면 쓰고, 안쓸거면 쓰지말고 선택은 너한테 준다~
	boolean customerWantsCondiments(){
		return true;
	}
	
	
}
