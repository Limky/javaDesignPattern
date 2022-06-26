package chapter08;

import java.util.Arrays;

public class DuckSortTestMain {

	public static void main(String[] args) {
		Duck[] ducks = { 
						new Duck("Daffy", 8), 
						new Duck("Dewey", 2),
						new Duck("Howard", 7),
						new Duck("Louie", 2),
						new Duck("Donald", 10), 
						new Duck("Huey", 2)
		 };

		int[] testint = {1,45,5,2};
		
		System.out.println("정렬 전:");
		display(testint);

		
		Arrays.sort(testint);
 
		System.out.println("\n정렬 후:");
		display(testint);

	}

	public static void display(int[] ducks) {
		for (int d : ducks) {
			System.out.println(d);
		}
	}
	
	public static void display(Duck[] ducks) {
		for (Duck d : ducks) {
			System.out.println(d);
		}
	}

}
