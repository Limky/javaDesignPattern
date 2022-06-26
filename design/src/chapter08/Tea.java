package chapter08;

//Tea 클래스는 hook 메서드를 선택하지 않아 따로 구현하지 않았음!
public class Tea extends CaffeineBeverageWithHook{

	@Override
	void brew() {
		System.out.println("찻잎을 우려내는 중");
		
	}

	@Override
	void addCondiments() {
		System.out.println("레몬을 추가하는 중");
		
	}

	
}
