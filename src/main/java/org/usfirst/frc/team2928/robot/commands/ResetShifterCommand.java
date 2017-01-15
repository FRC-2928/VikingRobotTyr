package org.usfirst.frc.team2928.robot.commands;

import org.usfirst.frc.team2928.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ResetShifterCommand extends Command {

	public ResetShifterCommand() {
		requires(Robot.shift);
	}

	public ResetShifterCommand(String name) {
		super(name);
	}

	public ResetShifterCommand(double timeout) {
		super(timeout);
	}

	public ResetShifterCommand(String name, double timeout) {
		super(name, timeout);
	}

	@Override
	protected void initialize() {
		Robot.shift.reset();

	}

	@Override
	protected void execute() {


	}

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void end() {

	}

	@Override
	protected void interrupted() {

	}

}
