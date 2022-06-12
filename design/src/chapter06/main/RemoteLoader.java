package chapter06.main;

import chapter06.command.impl.LightOffCommand;
import chapter06.command.impl.LightOnCommand;
import chapter06.invoker.RemoteControl;
import chapter06.receiver.Light;

public class RemoteLoader {
	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light();

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);

		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

		remoteControl.onButtonWasPushed(0);

		remoteControl.offButtonWasPushed(0);

		remoteControl.undoButtonWasPushed();

	}
}
