package frc.robot.Command.Shooter;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Command.OneShotCommand;
import frc.robot.Robot;

public class Calibrate extends OneShotCommand {

    public Calibrate()
    {
        super(Robot.shooter.lifter::calibrate, Robot.shooter.lifter);
    }
}
