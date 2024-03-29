package org.usfirst.frc.team2928.robot.commands;

import org.usfirst.frc.team2928.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class LowerShooterCommand extends Command {

	public LowerShooterCommand() {
		requires(Robot.lifter);
	}

	public LowerShooterCommand(String name) {
		super(name);
		requires(Robot.lifter);
	}

	public LowerShooterCommand(double timeout) {
		super(timeout);
	}

	public LowerShooterCommand(String name, double timeout) {
		super(name, timeout);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.lifter.Lower();
		SmartDashboard.putNumber("EncPos", Robot.lifter.lifterPos());
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {

		Robot.lifter.Stop();
		SmartDashboard.putNumber("EncPos", Robot.lifter.lifterPos());


	}

	@Override
	protected void interrupted() {
		Robot.lifter.Stop();
		SmartDashboard.putNumber("EncPos", Robot.lifter.lifterPos());


	}

}
