package org.usfirst.frc.team2928.robot.subsystems;

import org.usfirst.frc.team2928.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Tomahawk extends Subsystem {
	Solenoid solen;
	
	public Tomahawk() {
		this.solen = new Solenoid(RobotMap.tomahawkSolenoid);
	}
	
	public void Raise()
	{
		if (!this.solen.get())
		{
			this.solen.set(true);
		}
	}
	
	public void Lower()
	{
		if (this.solen.get())
		{
			this.solen.set(false);
		}
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
