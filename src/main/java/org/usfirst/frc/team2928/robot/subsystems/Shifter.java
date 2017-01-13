package org.usfirst.frc.team2928.robot.subsystems;

import org.usfirst.frc.team2928.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shifter extends Subsystem {
	private boolean debounce;
	private Solenoid solen;
	public Shifter() {
		this.solen = new Solenoid(RobotMap.shifterSolenoid);
		this.reset();
	}
	
	public void shiftDown() {
		boolean solenState = this.solen.get();
		if (solenState && solenState == debounce)
		{
			this.solen.set(false);
			this.debounce = false;
		}
	}
	
	public void shiftUp() {
		boolean solenState = this.solen.get();
		if (!solenState && solenState == debounce)
		{
			this.solen.set(true);
			this.debounce = true;
		}
	}
	
	public boolean isUp()
	{
		return this.solen.get();
	}
	public boolean inMotion()
	{
		return debounce != this.solen.get();
	}
	public void reset()
	{
		this.solen.set(false);
		this.debounce = false;
	}
	
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
