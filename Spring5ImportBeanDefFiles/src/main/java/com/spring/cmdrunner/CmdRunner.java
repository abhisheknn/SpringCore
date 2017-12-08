package com.spring.cmdrunner;

import com.spring.cmd.Command;

public class CmdRunner {

	Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void runCmd() {
		this.command.runCmd();
	}
}
