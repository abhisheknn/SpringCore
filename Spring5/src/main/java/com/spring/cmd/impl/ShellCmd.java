package com.spring.cmd.impl;

import com.spring.cmd.Command;

public class ShellCmd implements Command {

	@Override
	public void runCmd() {
	System.out.println("running Shell command");
		
	}
}
