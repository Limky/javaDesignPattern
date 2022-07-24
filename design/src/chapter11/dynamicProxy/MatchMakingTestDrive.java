package chapter11.dynamicProxy;
import java.lang.reflect.*;
import java.util.*;

public class MatchMakingTestDrive {
	HashMap<String, Person> datingDB = new HashMap<String, Person>();
 	
	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}
 
	public MatchMakingTestDrive() {
		initializeDatabase();
	}

	public void drive() {
		Person joe = getPersonFromDatabase("김자바"); 
		Person ownerProxy = getOwnerProxy(joe);
		System.out.println("이름 " + ownerProxy.getName());
		ownerProxy.setInterests("코딩, 바둑");
		System.out.println("본인 프록시에 관심 사항을 등록합니다.");
		try {
			ownerProxy.setGeekRating(10);
		} catch (Exception e) {
			System.out.println("본인 프록시에는 괴짜 지수를 매길 수 없습니다.");
		}
		System.out.println("괴짜 지수 : " + ownerProxy.getGeekRating());

		Person nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("이름 : " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("볼링, 바둑");
		} catch (Exception e) {
			System.out.println("타인 프록시에는 관심 사항을 등록할 수 없습니다.");
		}
		nonOwnerProxy.setGeekRating(3);
		System.out.println("타인 프록시에 괴짜지수를 매깁니다.");
		System.out.println("괴쫘 지수:  " + nonOwnerProxy.getGeekRating());
	}

	Person getOwnerProxy(Person person) {
 		
        return (Person) Proxy.newProxyInstance( 
            	person.getClass().getClassLoader(),
            	person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
	}

	Person getNonOwnerProxy(Person person) {
		
        return (Person) Proxy.newProxyInstance(
            	person.getClass().getClassLoader(),
            	person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
	}

	Person getPersonFromDatabase(String name) {
		return (Person)datingDB.get(name);
	}

	void initializeDatabase() {
		Person joe = new PersonImpl();
		joe.setName("김자바");
		joe.setInterests("자동차, 컴퓨터, 음악");
		joe.setGeekRating(7);
		datingDB.put(joe.getName(), joe);

		Person kelly = new PersonImpl();
		kelly.setName("켈리");
		kelly.setInterests("경매, 영화, 음악");
		kelly.setGeekRating(6);
		datingDB.put(kelly.getName(), kelly);
	}
}
