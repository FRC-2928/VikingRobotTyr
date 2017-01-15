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

	}

	public TomahawkCommand(double timeout) {
		super(timeout);
	}

	public TomahawkCommand(String name, double timeout) {
		super(name, timeout);
	}

	@Override
	protected void initialize() {
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
