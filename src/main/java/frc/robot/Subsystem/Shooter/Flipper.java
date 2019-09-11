package frc.robot.Subsystem.Shooter;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Flipper extends Subsystem {

    private Solenoid flipper;

    public enum FlipperState
    {
        OUT(true),
        IN(false);

        private boolean booleanValue;
        FlipperState(boolean booleanValue)
        {
            this.booleanValue = booleanValue;
        }
        boolean toBoolean()
        {
            return this.booleanValue;
        }
    }
    public void initDefaultCommand()
    {
        return;
    }

    public Flipper()
    {
        flipper = new Solenoid(RobotMap.SOLENOID_FLIPPER);
    }

    public void set(FlipperState state)
    {
        flipper.set(state.toBoolean());
    }
}
