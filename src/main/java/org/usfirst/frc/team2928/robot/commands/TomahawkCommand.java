package org.usfirst.frc.team2928.robot.commands;

import org.usfirst.frc.team2928.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TomahawkCommand extends Command {
	private boolean raise;
	public TomahawkCommand(boolean raise) {
		requires(Robot.tomahawk);
		this.raise = raise;
	}

	public TomahawkCommand(String name) {
		super(name);
		requires(Robot.shooterMotors);

		// TODO Auto-generated constructor stub
	}

	public TomahawkCommand(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	public TomahawkCommand(String name, double timeout) {
		super(name, timeout);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		if (raise)
		{
			Robot.tomahawk.Raise();
		} else
		{
			Robot.tomahawk.Lower();
		}
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
