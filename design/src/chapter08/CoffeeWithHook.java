package chapter08;

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverageWithHook{

	@Override
	void brew() {
		System.out.println("필터로 커피를 우려내는 중");
		
	}

	@Override
	void addCondiments() {
		System.out.println("우유와 설탕을 추가하는 중");
		
	}
	
	//hook 메서드
	//나는 필요할 것 같아서 쓸래 재정의 해야지 ㅎㅎ
	public boolean customerWantsCondiments(){
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")){
			return true;
		}else{
			return false;
		}
	}

	private String getUserInput() {
		
		String answer = null;
		System.out.println("커피에 우유와 설탕을 넣을까요? (y/n)");
		
		Scanner sc = new Scanner(System.in);
		answer = sc.nextLine();
		
		System.out.println("당신의 대답 : "+answer);
		
		if(answer == null){
			return "no";
		}
		
		return answer;
	}

}
