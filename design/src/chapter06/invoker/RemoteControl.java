package chapter06.invoker;

import chapter06.command.Command;
import chapter06.command.impl.NoCommand;

public class RemoteControl {

	Command[] onCommands;

	Command[] offCommands;

	Command undoCommand;

	public RemoteControl() {

		onCommands = new Command[7];

		offCommands = new Command[7];

		Command noCommand = new NoCommand(); // 아무 동작도 없는 커맨드 객체 일종의 Null 객체

		for (int i = 0; i < 7; i++) {

			onCommands[i] = noCommand;

			offCommands[i] = noCommand;

		}

		undoCommand = noCommand;

	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {

		onCommands[slot] = onCommand;

		offCommands[slot] = offCommand;

	}

	public void onButtonWasPushed(int slot) {

		onCommands[slot].execute();

		undoCommand = onCommands[slot];

	}

	public void offButtonWasPushed(int slot) {

		offCommands[slot].execute();

		undoCommand = offCommands[slot];

	}

	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < 7; i++) {

			sb.append(onCommands[i].getClass().getName() + " / " + offCommands[i].getClass().getName() + "\n");

		}

		return sb.toString();

	}

	public void undoButtonWasPushed() {
		undoCommand.undo();
		
	}

}

