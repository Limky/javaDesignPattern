package chapter02.main;

import chapter02.observer.impl.CurrentConditionsDisplay;
import chapter02.subject.impl.WeatherData;

public class WeatherStation {

	/*
		 장점
		1.Subject(주제) 쪽에서 일방적으로 데이터를 보내는 (푸시방식)방식 많이 아니라 Observer(옵저버)쪽에서 데이터를 가져가는 (풀방식)방식을 선택해서 사용할수 있다.		
		풀 방식의 처리가 좀더 권장되어진다. 이유는 수많은 옵저버가 필요로 하는걸 모두 파악하기란 자원의 낭비가 심하기 때문이다. 풀방식으로 처리된다면 등록된 옵저버중에 필요한 내용만 가져갈수도 있고, 만약 주제가 확장되어 상태가 몇개가 추가된다고 하더라도 옵저버에 갱신된 상태를 전달하기 위한 메소드를 일일히 고칠 필요 없이 게터 메소드 하나만 추가 하고 필요한 옵저버가 필요한 상태만 가지기 처리 할수 있기 때문이다.
		2.setChanged 메소드를 통하여 옵저버 메소드들을 갱신 하는 방법에 있어 좀더 유연성을 가질수 있다.(온도가 변경될때 1도 이상 변경될때만 디스플레이 장치에 값이 전달되야 할경우)
		
		3.객체 생성자에 관련 옵저버들을 처리 하기 위한 자료 구조를(스택, 큐 구조 또는 arrayList를 이용한 데이터 구조) 만들 필요가 없다.
		
		일단 스택 큐 언급은 했으나 옵저버 패턴을 이용한 처리에서 연락이 가는 순서에 의존한 처리는 잘못된 처리 방식 이므로 굳이 스택 이나 큐같은 방식이 아니라 set 이나 리스트 혹은 map 과같이 어떤 자료구조를 쓰더라도 상관은 없겠다. 단 순서에 의존한 처리만 하지 않는다면 말이다.
		일단 위에 기술한 모든 내용은 사용자가 직접 옵저버 패탠을 구현하여 처리 해도 얼마든지 구현이 가능 하지만 자바 내에서 제공해주는 api를 이용하여 좀더 편해진다는게 사용 이유라면 이유다.
		
		단점
		1. 일단 가장치명적인 단점은 Observable은 인터페이스가 아닌 클래스 라서 서브 클래스를 만들어야 하고
		2. 다른 수퍼 클래스를 상속받아 확장하고 있는경우 Observable의 기능을 추가 할수 없다. 그러므로 재사용성이 급격이 제약된다.(패턴의 사용이유는 재사용성의 증가인데..목적을 상실했다.)
		3. setChanged 메소드가 protected로 선언되어 Observable 클래스를 상속받은 서브 클래스에서만 호출이 가능 하다. 이 이야기는 인스턴스 변수로 사용할수 없다는 이야기다.
		(인스턴스 변수가 먼지 모른다고 하면 ... OTL 이다 스트레티지 패턴에 잘 나와 있으니 먼지 찾아 보길 바란다.) 결국 이러한 디자인은 상속보다는 구성을 사용한다는 근본 원칙에도 위배 된다.

	 */
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);

		
	}

}
