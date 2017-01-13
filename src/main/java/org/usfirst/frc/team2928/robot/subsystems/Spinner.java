package org.usfirst.frc.team2928.robot.subsystems;

import org.usfirst.frc.team2928.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Spinner extends Subsystem {
	Talon motor;
	public Spinner() {
		this.motor = new Talon(RobotMap.spinnerMotor);
	}

	public void On()
	{
		this.motor.set(-0.40);
	}
	
	public void Off()
	{
		this.motor.set(0);
	}
	public Spinner(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
