package chapter07.facade;

public class PopcornPopper {
	public void on(){
		System.out.println("팝콘 기계 가동");
	};
	
	public void pop(){
		System.out.println("팝콘 가열 멈추고 팝콘 pop!!");
	};
	
	public void off(){
		System.out.println("팝콘 기계 전원 종료");
	};
}
