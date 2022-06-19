package chapter07.adapter;

public class AdapterTestMain {

	public static void main(String[] args) {
		Cctv cctv = new ChinaCctv();
		
		Satellite satellite = new Korea5gCctv();
		Cctv satelliteAdapter = new Korea5gAdapter(satellite);
		
		//위성 카메라 테스트
		satellite.liveView();
		satellite.disconnectView();

		//기존 중국산 cctv 테스트
		test(cctv);
		
		//adapter(위성 카메라로 변환해 놓은..) 테스트
		test(satelliteAdapter);
		
	}
	
	static void test(Cctv cctv){
		System.out.println("");
		cctv.recordOn();
		cctv.recordOff();
	}

}
