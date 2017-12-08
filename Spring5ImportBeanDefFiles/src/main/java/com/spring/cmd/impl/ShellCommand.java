package com.spring.cmd.impl;

import com.spring.cmd.Command;

public class ShellCommand implements Command {
@Override
public void runCmd() {

	System.out.println("running Shell Command");
}
}
