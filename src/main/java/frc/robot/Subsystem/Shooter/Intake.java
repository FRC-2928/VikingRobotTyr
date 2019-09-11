package frc.robot.Subsystem.Shooter;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Intake extends Subsystem {
    Talon intake;
    public void initDefaultCommand()
    {
        return;
    }

    public Intake()
    {
        intake = new Talon(RobotMap.TALON_INTAKE);
    }

    public void set(double output)
    {
        intake.set(output);
    }
}
