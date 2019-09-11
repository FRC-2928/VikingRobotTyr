package frc.robot.Command.Shooter;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.Subsystem.Shooter.Tomahawk;

public class SetTomahawk extends Command {
    private Tomahawk.TomahawkState target;

    public SetTomahawk(Tomahawk.TomahawkState target)
    {
        requires(Robot.shooter.tomahawk);
        this.target = target;
    }

    public void initialize()
    {
        Robot.shooter.tomahawk.set(target);
    }

    public boolean isFinished()
    {
        return true;
    }
}
