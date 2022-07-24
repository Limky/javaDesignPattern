package chapter11.gumballRemote;

//[동전없음] -> 동전투입 -> [동전있음]
public class NoQuarterState implements State {
	private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    //[동전없음] 상태에서 실제로 필요한 메소드
	public void insertQuarter() {
		System.out.println("동전을 넣습니다.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		System.out.println("동전을 넣어주세요~~");
	}
 
	public void turnCrank() {
		System.out.println("동전을 넣어주세요~~");
	 }
 
	public void dispense() {
		System.out.println("동전을 넣어주세요~~");
	} 
	
	public void refill() { }
 
	  public String toString(){
	    	return "[동전없음]";
	    }
}
