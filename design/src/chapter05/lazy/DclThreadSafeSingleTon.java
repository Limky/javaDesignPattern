package chapter05.lazy;

/*
장점 : Lazy initialization 방식에서 thread-safe하지 않은 점을 보완한다. 뿐만 아니라, 초기화 시점에만 thread-safe 하며 thread-safe에 대한 cost를 줄인다.
단점 : 구현이 제일 복잡?
*/
public class DclThreadSafeSingleTon {

	//volatile 사용하여,멀티스레드 환경에서 변수 동기화 안정성 확보
	private static volatile DclThreadSafeSingleTon instance;

	private DclThreadSafeSingleTon() {
	}

	public static DclThreadSafeSingleTon getInstance() {
		// synchronized 제거 후 Double-checked locking
		if (instance == null) {
			synchronized (DclThreadSafeSingleTon.class) {
				if (instance == null)
					instance = new DclThreadSafeSingleTon();
			}
		}
		return instance;
	}

}
