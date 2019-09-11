package frc.robot;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Subsystem.Chassis.Chassis;
import frc.robot.Subsystem.Shooter.Shooter;

public class Robot extends TimedRobot {
  private Compressor compressor;
  public static Chassis chassis;
  public static Shooter shooter;
  public static OperatorInterface oi;

  @Override
  public void robotInit() {
    compressor = new Compressor();
    chassis = new Chassis();
    shooter = new Shooter();
    compressor.start();
    CameraServer.getInstance().startAutomaticCapture();
    oi = new OperatorInterface();
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void autonomousInit() {
    Scheduler.getInstance().removeAll();

  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    Scheduler.getInstance().removeAll();
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void disabledInit() {
      Scheduler.getInstance().removeAll();
  }

  @Override
  public void testPeriodic() {
  }
}
