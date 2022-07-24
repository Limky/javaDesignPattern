package chapter11.gumball;

//[알맹이매진] -> 알맹이리필 -> [동전없음]
public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("동전을 넣을 수 없습니다. 이미 알맹이 매진");
	}
 
	public void ejectQuarter() {
		System.out.println("동전을 돌려드릴 수 없습니다.");
	}
 
	public void turnCrank() {
		System.out.println("죄송합니다. 매진되었습니다.");
	}
 
	public void dispense() {
		System.out.println("알맹이를 내보낼 수 없습니다.");
	}
	
	//[알맹이매진] -> 알맹이리필 -> [동전없음]
	public void refill() { 
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	public String toString(){
	  	return "[알맹이매진]";
	}
}
