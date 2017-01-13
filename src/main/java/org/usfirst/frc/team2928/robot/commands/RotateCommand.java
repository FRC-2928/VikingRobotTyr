package org.usfirst.frc.team2928.robot.commands;

import org.usfirst.frc.team2928.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class RotateCommand extends Command {

	public RotateCommand() {
		// TODO Auto-generated constructor stub
		//requires(Robot.drivebase);
		requires(Robot.gyroPid);
		Robot.gyroPid.enable();
		SmartDashboard.putNumber("Gyro Constructor", 7);
		
	}

	

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		//Temporary Reset
		Robot.gyroPid.resetGyro(90);
		SmartDashboard.putNumber("Gyro Initalize", 12);
	}

	@Override
	protected void execute() {
		// TODO Auto-generted method stub
		SmartDashboard.putNumber("Gyro Execute", 10);
		SmartDashboard.putNumber("Gyro Hash", this.hashCode());
		double pidInput = Robot.gyroPid.returnPIDInput();
		SmartDashboard.putNumber("Gyro PID Input", pidInput);
		Robot.gyroPid.usePIDOutput(pidInput);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stubo
		double diff = Robot.gyroPid.returnPIDInput() ;
		SmartDashboard.putNumber("Finished", 12);
		double target = Robot.gyroPid.getTargetAngle();
		if(diff < 10 && diff > -10){
			
			return true;
		}
		
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		end();
	}

}
