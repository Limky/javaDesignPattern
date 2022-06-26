package chapter08;

public class BeverageTestMain {

	public static void main(String[] args) {
		
		
		Tea tea = new Tea();
		CoffeeWithHook coffee = new CoffeeWithHook();
		
		System.out.println("홍차 준비중--------");
		tea.prepareRecipe();
		
		System.out.println("커피 준비중---------");
		coffee.prepareRecipe();
		

	}

}
