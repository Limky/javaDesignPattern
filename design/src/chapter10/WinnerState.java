package chapter10;
//[당첨상태] -> 알맹이 내보냄 -> (0 = n) [알맹이매진]
//                      -> (0 < n) [동전없음]
public class WinnerState implements State {
    GumballMachine gumballMachine;
 
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("알맹이를 내보내고 있습니다.");
	}
 
	public void ejectQuarter() {
		System.out.println("이미 알맹이를 뽑으셨습니다.");
	}
 
	public void turnCrank() {
		System.out.println("손잡이는 한 번만 돌려주세요.");
	}
 
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			System.out.println("축하드립니다. 알맹이를 하나 더 받습니다!!!");
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
            	System.out.println("Oops, out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
 
	public void refill() {}
	
	public String toString(){
	  	return "[당첨상태]";
	}
	
}
	

