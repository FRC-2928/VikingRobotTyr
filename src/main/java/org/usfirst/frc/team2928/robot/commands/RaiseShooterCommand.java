package org.usfirst.frc.team2928.robot.commands;

import org.usfirst.frc.team2928.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class RaiseShooterCommand extends Command {

	public RaiseShooterCommand() {
		requires(Robot.lifter);
	}

	public RaiseShooterCommand(String name) {
		super(name);
		requires(Robot.lifter);
		// TODO Auto-generated constructor stub
	}

	public RaiseShooterCommand(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	public RaiseShooterCommand(String name, double timeout) {
		super(name, timeout);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
	}

	
	protected void execute() {
		Robot.lifter.Raise();
		SmartDashboard.putNumber("EncPos", Robot.lifter.lifterPos());
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		Robot.lifter.Stop();
		SmartDashboard.putNumber("EncPos", Robot.lifter.lifterPos());

		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		Robot.lifter.Stop();
		SmartDashboard.putNumber("EncPos", Robot.lifter.lifterPos());

		// TODO Auto-generated method stub

	}

}
