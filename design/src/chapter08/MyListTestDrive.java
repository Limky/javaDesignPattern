package chapter08;

import java.util.Arrays;
import java.util.List;

public class MyListTestDrive {
 
	public static void main(String[] args) {
		String[] ducks = { "Mallard Duck", "Redhead Duck", "Rubber Duck", "Decoy Duck"};
		
		//String list를 관리하는 나만의 리스트를 구현 AbstractList 상속받아서 서브클래스(MyStringList) 구현 필요
		MyStringList ducksList = new MyStringList(ducks);
		
		//subList 템플릿 메서드이고
		//subList 해당 알고리즘에서 get, size를 활용하여 리스트를 자르는 동작을 수행
		//따라서 AbstractList 슈퍼클래스를 우리는 상속받아서 기본기능은 가져다 쓰면서, get, size 재정의함!
		List ducksSubList = ducksList.subList(2, 3); 
													
		for (int i = 0; i < ducksSubList.size(); i++) {
			System.out.println(ducksSubList.get(i));
		}
	}
}