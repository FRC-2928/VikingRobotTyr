package frc.robot.Command.Chassis;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class JoystickDrive extends Command {

    @Override
    protected boolean isFinished() {
        return !DriverStation.getInstance().isOperatorControl();
    }

    public JoystickDrive()
    {
        requires(Robot.chassis.drivetrain);
    }

    public void initialize()
    {
        Robot.chassis.drivetrain.setMotorSafetyEnabled(true);
    }

    @Override
    protected void execute() {
      double driveX = Robot.oi.getDriveXR();
        driveX = 0;
  
      double driveY = Robot.oi.getDriveYL();
        driveY = 0;
    
  
      Robot.chassis.drivetrain.drive(driveY, -driveX);
    }
}