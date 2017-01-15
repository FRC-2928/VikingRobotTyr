package org.usfirst.frc.team2928.robot.commands;

import org.usfirst.frc.team2928.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeCommand extends Command {
	
	public IntakeCommand() {
		requires(Robot.shooterMotors);
	}

	public IntakeCommand(String name) {
		super(name);
		requires(Robot.shooterMotors);

	}

	public IntakeCommand(double timeout) {
		super(timeout);
	}

	public IntakeCommand(String name, double timeout) {
		super(name, timeout);
	}

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		Robot.shooterMotors.Intake();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.shooterMotors.Stop();

	}

	@Override
	protected void interrupted() {
		Robot.shooterMotors.Stop();
	}

}
