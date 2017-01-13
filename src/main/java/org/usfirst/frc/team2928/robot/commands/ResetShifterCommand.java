package org.usfirst.frc.team2928.robot.commands;

import org.usfirst.frc.team2928.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ResetShifterCommand extends Command {

	public ResetShifterCommand() {
		// TODO Auto-generated constructor stub
		requires(Robot.shift);
	}

	public ResetShifterCommand(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public ResetShifterCommand(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	public ResetShifterCommand(String name, double timeout) {
		super(name, timeout);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		Robot.shift.reset();

	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
