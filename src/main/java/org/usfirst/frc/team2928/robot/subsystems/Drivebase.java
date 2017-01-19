package org.usfirst.frc.team2928.robot.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import org.usfirst.frc.team2928.robot.OI;
import org.usfirst.frc.team2928.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team2928.robot.commands.DriveCommand;

public class Drivebase extends Subsystem {
    private final RobotDrive drive;
	private final ADXRS450_Gyro gyro = new ADXRS450_Gyro();

	public Drivebase() {
		this.drive = new RobotDrive(new CANTalon(RobotMap.frontLeftDrive),new CANTalon(RobotMap.backLeftDrive),
					 new CANTalon(RobotMap.frontRightDrive),new CANTalon(RobotMap.backRightDrive));
	}
	
	public void drive(double moveValue, double rotateValue){
		//moveValue and rotateValue had signs inverted and were swapped to fix a wiring error
		drive.arcadeDrive(-rotateValue,-moveValue);
	}
	
	public void rotate(double angularVelocity){
		drive.arcadeDrive(angularVelocity, 0);
		SmartDashboard.putNumber("Drivebase Speed", angularVelocity);
	}

    public void calibrateGyro() {
        gyro.calibrate();
        gyro.reset();
    }

	public double getGyroAngle(){
	    return gyro.getAngle();
    }

	public void stop()
	{
		drive.arcadeDrive(0, 0);
	}

	@Override
	protected void initDefaultCommand() {
	    setDefaultCommand(new DriveCommand());
	}
}
