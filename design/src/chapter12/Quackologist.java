package chapter12;

public class Quackologist implements Observer {
 
	public void update(QuackObservable duck) {
		System.out.println("꽥꽥학자: " + duck + " 가 방금 소리냈다.");
	}
 
}
