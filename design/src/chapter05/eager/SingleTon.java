package chapter05.eager;
/*

장점 : static으로 생성된 변수에 싱글톤 객체를 선언했기 때문에 클래스 로더에 의해 클래스가 로딩 될 때 싱글톤 객체가 생성됩니다. 
           또 클래스 로더에 의해 클래스가 최초 로딩 될 때 객체가 생성됨으로 Thread-safe합니다.
단점 : 싱글톤객체 사용유무와 관계없이 클래스가 로딩되는 시점에 항상 싱글톤 객체가 생성되고, 메모리를 잡고있기 때문에 비효율적일 수 있다. 

 */
public class SingleTon {
	//private static으로 선언
	private static SingleTon instance = new SingleTon();
	
	//생성자
	private SingleTon() {}
	
	//인스턴스 리턴
	public static SingleTon getInstance() {
		return instance;
	}
}
