package chapter05.holder;
/*
이 방법은 클래스안에 클래스(Holder)를 두어 JVM의 Class Loader 매커니즘과 Class가 로드되는 시점을 이용한 방법입니다. 
Lazy initialization 방식을 가져가면서 Thread간 동기화문제를 동시에 해결할 수 있습니다. 
중첩클래스 Holder는 getInstance 메서드가 호출되기 전에는 참조 되지 않으며, 
최초로 getInstance() 메서드가 호출 될 때 클래스 로더에 의해 싱글톤 객체를 생성하여 리턴합니다. 
우리가 알아둬야 할 것은 holder 안에 선언된 instance가 static이기 때문에 클래스 로딩 시점에 한번만 호출된다는 점을 이용한것이죠. 
또 final을 써서 다시 값이 할당되지 않도록 합니다. 

*/
public class SingleTon {
	private SingleTon(){}
	
	//중첩클래스 Holder 선언..(중첩클래스 Holder는 getInstance 메서드가 호출되기 전에는 참조 되지 않음)
	private static class SingleTonHolder{
		private static final SingleTon instance = new SingleTon();
	}
	
	public static SingleTon getInstance(){
		return SingleTonHolder.instance;
	}

}
