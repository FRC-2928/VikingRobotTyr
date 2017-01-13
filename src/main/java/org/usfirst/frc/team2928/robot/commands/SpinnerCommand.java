package org.usfirst.frc.team2928.robot.commands;

import org.usfirst.frc.team2928.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SpinnerCommand extends Command {

	public SpinnerCommand() {
		requires(Robot.spinner);
	}

	public SpinnerCommand(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public SpinnerCommand(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	public SpinnerCommand(String name, double timeout) {
		super(name, timeout);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.spinner.On();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.spinner.Off();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Robot.spinner.Off();
	}

}
