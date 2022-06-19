package chapter07.facade;

public class TheaterLights {
	int light = 10;
	
	public int getLight() {
		return light;
	}

	public void setLight(int light) {
		this.light = light;
	}

	public void dim(int light){
		setLight(light);
		System.out.println(getLight()+"만큼 조명 줄이기~~");
	}
	
	public void on(){
		System.out.println("조명 키기!!");
	}
}
