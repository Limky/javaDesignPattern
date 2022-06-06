package chapter05.lazy;

/*
장점 : Lazy initialization 방식에서 thread-safe하지 않은 점을 보완한다. 
단점 : synchronized 키워드를 사용할 경우 자바 내부적으로 해당 영역이나 메서드를 lock, unlock 처리하기 때문에 내부적으로 많은 cost가 발생한다. 
따라서 많은 thread 들이 getInstance()를 호출하게 되면 프로그램 전반적인 성능저하가 발생한다.
*/
public class ThreadSafeSingleTon {

	private static ThreadSafeSingleTon instance;

	private ThreadSafeSingleTon(){}
	
	public static synchronized ThreadSafeSingleTon getInstance(){
		if(instance == null){
			instance = new ThreadSafeSingleTon();
		}
		return instance;
	}

}
