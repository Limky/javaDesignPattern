package chapter07.facade;

public class Amplifier {
	
	StreamingPlayer player;
	int volume;
	
	public void on(){
		System.out.println("amp를 켭니다.");
	}
	
	public void off(){
		System.out.println("amp를 끕니다ㅠㅠㅠ");
	}
	
	public void setStreamingPlayer(StreamingPlayer player){
		this.player = player;
	}
	
	public void setSurroundSound(){
		System.out.println(volume + "볼륨으로amp 써라운드 준비");
	}
	
	public void setVolume(int volume){
		this.volume = volume;
	}
	
}
