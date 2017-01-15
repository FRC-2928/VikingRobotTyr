
package org.usfirst.frc.team2928.robot.commands;

import org.usfirst.frc.team2928.robot.OI;
import org.usfirst.frc.team2928.robot.Robot;
import org.usfirst.frc.team2928.robot.subsystems.Drivebase;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
@SuppressWarnings("unused")
public class DriveCommand extends Command {
    public DriveCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drivebase);
    }

    // Called just before this Command runs the first time
    protected void initialize() {

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivebase.drive(OI.stick.getY(), OI.stick.getX());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivebase.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
