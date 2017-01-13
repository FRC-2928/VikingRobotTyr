package org.usfirst.frc.team2928.robot.subsystems;

import org.usfirst.frc.team2928.robot.Robot;
import org.usfirst.frc.team2928.robot.RobotMap;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class GyroPid extends PIDSubsystem {
	//AnalogGyro gyro;
	ADXRS450_Gyro gyro;
	public double target;
	public GyroPid(double p, double i, double d) {
		super(p, i, d);
		// TODO Auto-generated constructor stub
	}

	public GyroPid(String name, double p, double i, double d) {
		super(name, p, i, d);
		// TODO Auto-generated constructor stub
	}

	public GyroPid(double p, double i, double d, double period) {
		super(p, i, d, period);
		// TODO Auto-generated constructor stub
	}

	public GyroPid(String name, double p, double i, double d, double f) {
		super(name, p, i, d, f);
		this.gyro = new ADXRS450_Gyro();
		calibrate();
		// TODO Auto-generated constructor stub
	}

	public GyroPid(double p, double i, double d, double period, double f) {
		super(p, i, d, period, f);
		// TODO Auto-generated constructor stub
	}

	public GyroPid(String name, double p, double i, double d, double f, double period) {
		super(name, p, i, d, f, period);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double returnPIDInput() {
		// TODO Auto-generated method stub
		double angle = gyro.getAngle();
		
		double diff =  this.target - angle;
		SmartDashboard.putNumber("Gyro Angle", angle);
		SmartDashboard.putNumber("Gyro Diff", diff);
		return diff;
	}

	@Override
	public void usePIDOutput(double output) {
		// TODO Auto-generated method stubis
		double clamp = .6;
		double realOutput = output;
		if( output < -clamp ){
			realOutput = -clamp;
		}
		if(output > clamp){
			realOutput = clamp;
		}
		Robot.drivebase.rotate(realOutput);
		SmartDashboard.putNumber("Gyro Output", realOutput);

	}
	public void resetGyro(double angle){
		calibrate();
		this.target = angle;
		SmartDashboard.putNumber("Gyro Value", gyro.getAngle());
	}
	public void calibrate()
	{
		gyro.calibrate();
		gyro.reset();
	}
	public double getTargetAngle(){
		return this.target;
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
