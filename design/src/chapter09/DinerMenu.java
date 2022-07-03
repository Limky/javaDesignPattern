package chapter09;

public class DinerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
  
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("채식주의자용 BLT",
			"통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
		addItem("BLT",
			"통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99);
		addItem("오늘의 스프",
			"감자 샐러드를 곁들인 오늘의 스프", false, 3.29);
		addItem("Hotdog",
			"A hot dog, with sauerkraut, relish, onions, topped with cheese",
			false, 3.05);
		addItem("핫도그",
			"사워클라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", true, 3.99);

	}
  
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("메뉴가 다 찼음. 더 이상 추가 불가!!!");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
 
}
