package org.usfirst.frc.team2928.robot.commands;

import org.usfirst.frc.team2928.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RotateCommand extends Command {

	public RotateCommand() {
		requires(Robot.gyroPid);
		Robot.gyroPid.enable();
	}

	@Override
	protected void initialize() {
		Robot.gyroPid.calibrate();
		Robot.gyroPid.setSetpoint(90);
	}

	@Override
	protected void execute() {

    }

	@Override
	protected boolean isFinished() {
	    return Robot.gyroPid.onTarget();
	}

	@Override
	protected void end() {
	    Robot.drivebase.stop();
    }

	@Override
	protected void interrupted() {
		end();
	}

}
