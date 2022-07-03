package chapter09;

import java.util.*;

public class MenuTestDrive {
	public static void main(String args[]) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        //CafeMenu cafeMenu = new Cafe Menu();
 
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		
		waitress.printMenu();
		
	}
	
}
