package org.usfirst.frc.team2928.robot.subsystems;

import org.usfirst.frc.team2928.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Lifter extends Subsystem {
	private CANTalon motor;
	public Lifter() {
		this.motor = new CANTalon(RobotMap.lifterMotor);
	}

	public Lifter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void Raise()
	{
		this.motor.set(.85);
	}
	
	public void Lower()
	{
		this.motor.set(-.85);
	}
	
	public void RunAtSpeed(float speed)
	{
		if (speed > .85 || speed < -.85)
		{
			this.motor.set(0);
			return;
		}
		this.motor.set(speed);
	}
	public void Stop()
	{
		this.motor.set(0);
	}
	public int lifterPos()
	{
		return motor.getEncPosition();
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
