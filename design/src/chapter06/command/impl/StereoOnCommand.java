package chapter06.command.impl;

import chapter06.command.Command;
import chapter06.receiver.Stereo;

public class StereoOnCommand implements Command{
	Stereo stereo;

	public StereoOnCommand(Stereo stereo) {

		this.stereo = stereo;

	}

	@Override
	public void execute() {

		stereo.on();

		stereo.setCD();

		stereo.setVolume(11);

	}

	@Override
	public void undo() {

		stereo.off();

	}

}
