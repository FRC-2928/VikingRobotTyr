package org.usfirst.frc.team2928.robot.commands;

import org.usfirst.frc.team2928.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class OuttakeCommand extends Command {
	
	public OuttakeCommand() {
		requires(Robot.shooterMotors);
	}

	public OuttakeCommand(String name) {
		super(name);
		requires(Robot.shooterMotors);

	}

	public OuttakeCommand(double timeout) {
		super(timeout);
	}

	public OuttakeCommand(String name, double timeout) {
		super(name, timeout);
	}

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		Robot.shooterMotors.Outtake();
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
