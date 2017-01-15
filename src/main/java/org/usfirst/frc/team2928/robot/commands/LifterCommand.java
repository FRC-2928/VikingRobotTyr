package org.usfirst.frc.team2928.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class LifterCommand extends Command {

	private final static int lifterHighTarget = 15274;
	public LifterCommand() {
	}

	public LifterCommand(String name) {
		super(name);
	}

	public LifterCommand(double timeout) {
		super(timeout);
	}

	public LifterCommand(String name, double timeout) {
		super(name, timeout);
	}

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {

	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {

	}

	@Override
	protected void interrupted() {

	}

}
