package org.usfirst.frc.team2928.robot.subsystems;

import org.usfirst.frc.team2928.robot.Robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

public class GyroPid extends PIDSubsystem {

	private final ADXRS450_Gyro gyro;

	public GyroPid(String name, double p, double i, double d, double f) {
		super(name, p, i, d, f);
		this.gyro = new ADXRS450_Gyro();
		calibrate();
		setOutputRange(-0.6, 0.6);
		setAbsoluteTolerance(1);
	}

	@Override
	protected double returnPIDInput() {
		return gyro.getAngle();
	}

	@Override
	protected void usePIDOutput(double output) {
	    Robot.drivebase.rotate(output);
	}

	public void calibrate() {
		gyro.calibrate();
		gyro.reset();
	}

	@Override
	protected void initDefaultCommand() {}
}
