package chapter06.main;

import chapter06.command.impl.LightOnCommand;
import chapter06.invoker.SimpleRemoteControl;
import chapter06.receiver.Light;

/*
 식당을 예로들어보자.
 
1. 손님이 웨이터에게 주문을 한다.
2. 웨이터가 고객의 주문을 주문서에 적는다.
3. 웨이터는 주문서를 주방에 전달하여 주문을 요청한다.
4. 요리사는 주문서에 적힌 주문대로 음식을 자신의 노하우로 만든다.
 
손님       			==    	클라이언트
웨이터    		==    	인보커 객체
주문서    		==    	커맨드 객체
주방장    		==    	리시버 객체
주문을 하는것 		== 		setCommand()
주문을 요청하는것 	== 		execute()

 */

public class RemoteControlTest {

	public static void main(String[] args) {

		SimpleRemoteControl remote = new SimpleRemoteControl(); //invoker 생성

		Light light = new Light(); //리시버 객체 생성(실제 최종 요구사항 동작은 리시버만 알고 있음)

		LightOnCommand lightOn = new LightOnCommand(light); //커맨드객체에 리시버 전달받아 세팅
 
		remote.setCommand(lightOn); //invoker는 command(요청사항/리시버도 세팅되어있음)을 전달받아 세팅

		remote.buttonWasPressed(); 

	}

}
