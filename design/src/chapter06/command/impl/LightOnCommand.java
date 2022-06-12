package chapter06.command.impl;

import chapter06.command.Command;
import chapter06.receiver.Light;

public class LightOnCommand implements Command {
	
	Light light; //리시버 객체
	
	public LightOnCommand(Light light) {

		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	
	}
}
