package org.usfirst.frc.team2928.robot.subsystems;

import org.usfirst.frc.team2928.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ShooterSolenoid extends Subsystem {
	Solenoid solen;

	public ShooterSolenoid() {
		this.solen = new Solenoid(RobotMap.shooterSolenoid);
	}
	
	public void Shoot()
	{
		solen.set(true);
	}
	
	public void Retract()
	{
		solen.set(false);
	}
	
	public ShooterSolenoid(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
