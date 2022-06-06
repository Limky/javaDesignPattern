package chapter05.lazy;

/*
장점 : 싱글톤 객체가 필요할 때 인스턴스를 얻을 수 있습니다. Eager initialization 방식에 단점을 보완할 수 있습니다.(메모리 누수 방지)
단점 : 만약 multi-thread 환경에서 여러 곳에서 동시에 getInstance()를 호출할 경우 인스턴스가 두번 생성될 여지가 있습니다. 
           즉 multi-thread 환경에서는 싱글톤 철학이 깨질 수 있는 위험이 있습니다.
*/
public class SingleTon {
	private static SingleTon instance;

	private SingleTon(){}
	
	public static SingleTon getInstance(){
		if(instance == null){
			instance = new SingleTon();
		}
		return instance;
	}
}
