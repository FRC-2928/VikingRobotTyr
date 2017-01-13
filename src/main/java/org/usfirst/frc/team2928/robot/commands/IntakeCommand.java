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

		// TODO Auto-generated constructor stub
	}

	public IntakeCommand(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	public IntakeCommand(String name, double timeout) {
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
		Robot.shooterMotors.Intake();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.shooterMotors.Stop();

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Robot.shooterMotors.Stop();
	}

}
