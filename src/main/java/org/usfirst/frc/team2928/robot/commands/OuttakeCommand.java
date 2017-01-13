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

		// TODO Auto-generated constructor stub
	}

	public OuttakeCommand(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	public OuttakeCommand(String name, double timeout) {
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
		Robot.shooterMotors.Outtake();
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
