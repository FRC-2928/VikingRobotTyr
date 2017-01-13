package org.usfirst.frc.team2928.robot.commands;

import org.usfirst.frc.team2928.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShootCommand extends Command {

	public ShootCommand() {
		requires(Robot.shooterSolen);
	}

	public ShootCommand(String name) {
		super(name);
		requires(Robot.shooterSolen);
		// TODO Auto-generated constructor stub
	}

	public ShootCommand(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	public ShootCommand(String name, double timeout) {
		super(name, timeout);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		Robot.shooterSolen.Shoot();
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		Robot.shooterSolen.Retract();
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		Robot.shooterSolen.Retract();

		// TODO Auto-generated method stub

	}

}
