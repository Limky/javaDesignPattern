package chapter07.facade;

public class HomeTheaterTestMain {

	public static void main(String[] args) {
		
		//해당 main 메서드가 클라이언트라고 생각하고, 아래와 같이 구성요소를 세팅한다.
		Amplifier amp = new Amplifier();
		StreamingPlayer player = new StreamingPlayer();
		Projector projector = new Projector();
		TheaterLights lights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper popper = new PopcornPopper();
		
		//위 인스턴스들간의 상호연관된 관계는 아래 퍼사드 객체에서 알아서 해결해줄테니, 우리는 구성요서만 넘겨주자!!
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, player, projector, lights, screen, popper);
		
		//퍼사드 객체는 알아서 각 구성요소들간의 관계를 파악하여, 클라이언트의 요청을 처리한다!
		homeTheater.watchMovie("시계태엽 오렌지");
		homeTheater.endMovie();

	}

}
