package chapter12;

public class DecoyDuck implements Quackable {
	Observable observable;

	public DecoyDuck() {
		observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("<< 침묵. >>");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

}
