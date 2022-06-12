package chapter06.command.impl;

import chapter06.command.Command;
import chapter06.receiver.Stereo;

public class StereoOffCommand implements Command {

	Stereo stereo;

	public StereoOffCommand(Stereo stereo) {

		this.stereo = stereo;

	}

	@Override
	public void execute() {

		stereo.off();

	}

	@Override
	public void undo() {

		stereo.on();

		stereo.setCD();

		stereo.setVolume(11);

	}

}
