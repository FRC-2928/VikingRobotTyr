package org.usfirst.frc.team2928.robot.subsystems;

import org.usfirst.frc.team2928.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ShooterMotors extends Subsystem {
	Talon leftShoot;
	Talon rightShoot;
	public ShooterMotors() {
		// TODO Auto-generated constructor stub
		this.leftShoot = new Talon(RobotMap.leftShootMotor);
		this.rightShoot = new Talon(RobotMap.rightShootMotor);
	}
	public void Outtake() {
		leftShoot.set(.85);
		rightShoot.set(.85);
	}
	
	
	public void Stop()
	{
		leftShoot.set(0);
		rightShoot.set(0);
	}
	
	public void Intake()
	{
		leftShoot.set(-.85);
		rightShoot.set(-.85);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
