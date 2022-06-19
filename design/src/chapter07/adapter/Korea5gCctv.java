package chapter07.adapter;

public class Korea5gCctv implements Satellite{

	@Override
	public void liveView() {
		System.out.println("위성 카메라 로딩시간 0.00001sec, 녹화 최대 365일, 화질 8K");
		
	}

	@Override
	public void disconnectView() {
		System.out.println("위성 카메라 녹화 종료 !!!");
		
	}

}
