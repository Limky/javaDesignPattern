package chapter07.adapter;


//1. adapter는 기존 interface를 구현하면서, 기존 interface를 구현한 구체클래스의 메소드를 호출하는 구조는 가져감
//2. 기존 interface 구조는 가져가지만, 실제 실행은 변경된 다른 interface 구체클래스의 메소드를 호출함!!
//3. 

public class Korea5gAdapter implements Cctv{
	Satellite satellite;
	
	public Korea5gAdapter(Satellite satellite) {
		this.satellite = satellite;
	}
	
	
	@Override
	public void recordOn() {
		satellite.liveView();
		
	}

	@Override
	public void recordOff() {
		satellite.disconnectView();
		
	}

}
