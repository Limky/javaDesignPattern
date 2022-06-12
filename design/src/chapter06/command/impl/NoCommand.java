package chapter06.command.impl;

import chapter06.command.Command;

public class NoCommand implements Command {

    @Override
    public void execute() {
    }

    @Override
    public void undo() {

    }
}
