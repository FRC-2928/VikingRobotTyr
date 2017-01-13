package org.usfirst.frc.team2928.robot.subsystems;

import org.usfirst.frc.team2928.robot.OI;
import org.usfirst.frc.team2928.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


@SuppressWarnings("unused")
public class Drivebase extends Subsystem {
	RobotDrive drive;
	
	
	
	public Drivebase() {
		this.drive = new RobotDrive(new CANTalon(RobotMap.frontLeftDrive),new CANTalon(RobotMap.backLeftDrive),
					 new CANTalon(RobotMap.frontRightDrive),new CANTalon(RobotMap.backRightDrive));
	}
	
	public void drive(){
		//The wires must be plugged in backwards because there had 
		//to be negative signs here to make it work properly.
		drive.arcadeDrive(-OI.stick.getX(), -OI.stick.getY());
	}
	
	public void rotate(double angularVelocity){
		drive.arcadeDrive(angularVelocity, 0);
		SmartDashboard.putNumber("Drivebase Speed", angularVelocity);
	}
	
	public void stop()
	{
		drive.arcadeDrive(0, 0);
	}
	@Override
	protected void initDefaultCommand() {
	}
}
