package chapter07.facade;

public class StreamingPlayer {
	public void on(){
		System.out.println("StreamingPlayer 전원 on");
	}
	
	public void off(){
		System.out.println("StreamingPlayer 전원 off");
	}
	
	public void play(String movie){
		System.out.println(movie+" 재생합니다~~!!!");
	}
	
	public void stop(){
		System.out.println("재생을 중지합니다!! stop!");
	}
}
