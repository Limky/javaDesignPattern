package chapter07.adapter;

public class ChinaCctv implements Cctv {

	@Override
	public void recordOn() {
		System.out.println("카메라 로딩시간 10분, 녹화 최대 30일, 화질 800x800");
		
	}

	@Override
	public void recordOff() {
		System.out.println("카메라 녹화 종료 !!!");
	}

}
