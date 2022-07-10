package chapter09_2;

public class MenuTestDrive {
	public static void main(String args[]) {
		
		MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
		MenuComponent dinerMenu = new Menu("객체마을 식당 네유", "점심 메뉴");
		MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");
		MenuComponent dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨  보세요.");
		MenuComponent coffeeMenu = new Menu("커피 메뉴", "믹스 커피를 즐겨보세요");
		  
		
		MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴 입니다");//최상위 메뉴
  
		//최상위 메뉴에 복합객체 메뉴들을 추가
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
  
		pancakeHouseMenu.add(new MenuItem("팬케이크 아침메뉴", "팬케이크 반숙계란 토스트", true, 2.99));
		pancakeHouseMenu.add(new MenuItem("팬케이크 레귤러 아침메뉴", "달걀후라이와 팬케이크", false, 2.99));
		pancakeHouseMenu.add(new MenuItem("블루베리 팬케이크", "신선한 블루베리와 블루베리 시럽이 있는 팬케이크", true, 3.49));
		pancakeHouseMenu.add(new MenuItem("와플", "딸리 와플 또는 블루베리 와플", true, 3.59));
		
		dinerMenu.add(new MenuItem("파스타", "마리나라 소스 스파게티, 효모빵도 드립니다.", true, 3.89));
		dinerMenu.add(new MenuItem("채식주의자 BLT", "통밀에 양상추와 토마토를 곁들인 베이컨", true, 2.99));
		dinerMenu.add(new MenuItem("BLT", "통밀에 양상추와 토마토를 곁들인 베이컨", false, 2.99));
		dinerMenu.add(new MenuItem("오늘의 스프", "오늘의 스프 한 그릇과 감자 샐러드 한 그릇",false, 3.29));
		dinerMenu.add(new MenuItem("핫도그", "사워크라우트, 렐리시, 양파, 치즈를 얹은 핫도그", false, 3.05));
		dinerMenu.add(new MenuItem("찐 야채와 현미", "찐 야채와 현미", true, 3.99));
		dinerMenu.add(new MenuItem("파스타", "마리나라 소스를 곁들인 스파게티와 사워도우 빵 한 조각", true, 3.89));
			
		dinerMenu.add(dessertMenu); //메뉴에 메뉴를 추가하는 코드
		
		dessertMenu.add(new MenuItem("애플 파이", "바닐라 아이스크림을 얹은 플레이크 크러스트가 있는 애플 파이", true, 1.59));
		dessertMenu.add(new MenuItem("치즈케익", "초콜릿 그레이엄 크러스트를 곁들인 크리미한 뉴욕 치즈케이크", true, 1.99));
		dessertMenu.add(new MenuItem("셔벗", "라즈베리 한 스쿱과 라임 한 스쿱", true, 1.89));
		
		cafeMenu.add(new MenuItem("베지버거와 에어프라이","통밀 빵, 양상추, 토마토 및 감자 튀김에 채식 버거", true, 3.99));
		cafeMenu.add(new MenuItem("오늘의 수프", "오늘의 스프 한 잔과 사이드 샐러드", false, 3.69));
		cafeMenu.add(new MenuItem("브리또", "핀토 빈, 살사, 과카몰리를 통째로 넣은 라지 부리또", true, 4.29));
		
		//메뉴 항목을 추가하는 부분
		cafeMenu.add(coffeeMenu);
		
		coffeeMenu.add(new MenuItem("커피 케이크", "시나몬과 호두를 얹은 크럼블 케이크", true, 1.59));
		coffeeMenu.add(new MenuItem("베이글", " 참깨, 양귀비씨, 계피 건포도, 호박이 포함", false, 0.69));
		coffeeMenu.add(new MenuItem("비스코티", "아몬드 또는 헤이즐넛 비스코티 쿠키 3개", true, 0.89));

 
		Waitress waitress = new Waitress(allMenus);
   
		waitress.printMenu();
	}
}
