package frc.robot.Command.Shooter;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.Subsystem.Shooter.Flipper;

public class Flip extends Command {

    public void Shoot()
    {
        requires(Robot.shooter.flipper);
    }

    public void initialize()
    {
        Robot.shooter.flipper.set(Flipper.FlipperState.OUT);
    }

    public void execute()
    {

    }

    public void end()
    {
        Robot.shooter.flipper.set(Flipper.FlipperState.IN);
    }

    public void interrupted()
    {
        end();
    }

    public boolean isFinished()
    {
        return false;
    }
}
