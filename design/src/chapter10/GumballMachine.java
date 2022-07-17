package chapter10;

public class GumballMachine {
 
	//모든 상태 객체를 선언
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
 
	State state = soldOutState; //상태 인스턴스 변수
	int count = 0; //알맹이 개수가 저장됩니다
 
	//생성시에 알맹이 갯수 인자로 받아서 저장
	//각 상태 인스턴스 생성 및 저장
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);

		//알맹이 갯수가 0개 보다 많으면 [동전없음] 상태로 세팅
		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} 
	}
 
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("알맹이를 슬롯에서 내보내고 있습니다....");
		if (count > 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("머신에 알맹이가 리필되었습니다. 현재 알맹이 갯수: " + this.count);
		state.refill();
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n주식회사 왕뽑기");
		result.append("\n자바로 돌리는 최신형 뽑기 기계");
		result.append("\n남은 개수: " + count + " 알맹이");
		result.append("\n");
		result.append("상태 : " + state + "\n");
		return result.toString();
	}
}
