package frc.robot.Subsystem.Shooter;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Wheels extends Subsystem {
    Talon left;
    Talon right;
    public void initDefaultCommand()
    {
        return;
    }

    public Wheels()
    {
        left = new Talon(RobotMap.TALON_SHOOTER_LEFT);
        right = new Talon(RobotMap.TALON_SHOOTER_RIGHT);
    }

    public void set(double output)
    {
        left.set(output);
        right.set(output);
    }
}
