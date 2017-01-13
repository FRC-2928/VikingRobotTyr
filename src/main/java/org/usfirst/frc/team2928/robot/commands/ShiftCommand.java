package org.usfirst.frc.team2928.robot.commands;

import org.usfirst.frc.team2928.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class ShiftCommand extends Command{
	private boolean shiftingUp;
	public ShiftCommand() {
		requires(Robot.shift);
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		shiftingUp = !Robot.shift.isUp();
		if(shiftingUp)
		{
			Robot.shift.shiftUp();
		} else
		{
			Robot.shift.shiftDown();
		}
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return !Robot.shift.inMotion();
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
