package chapter06.command.impl;

import chapter06.command.Command;
import chapter06.receiver.Light;

public class LightOffCommand implements Command {

	Light light;

	public LightOffCommand(Light light) {

		this.light = light;

	}

	@Override
	public void execute() {

		light.off();

	}

	@Override
	public void undo() {

		light.on();

	}

}
