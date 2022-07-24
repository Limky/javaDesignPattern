package chapter11.gumballRemote;

import java.util.Random;
//[동전있음] -> 손잡이 돌림 -> [알맹이판매] 여기서 10/1 확률 당첨되면 (gumballMachine.getWinnerState()) 세탕함 -> 그러면 WinnerState에서 알아서 2개 알맹이 나감
//         -> 동전반환 -> [동전없음]
public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("동전은 한 개만 넣어주세요.");
	}
 
	//[동전있음] 실제로 필요한 메소드
	public void ejectQuarter() {
		System.out.println("동전이 반환됩니다.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	//[동전있음] 실제로 필요한 메소드
	public void turnCrank() {
		System.out.println("손잡이를 돌리셨습니다.");
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState()); //당첨
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

    public void dispense() {
        System.out.println("알맹이를 내보낼 수 없습니다.");
    }
    
    public void refill() { }
 
    public String toString(){
    	return "[동전있음]";
    }
}
