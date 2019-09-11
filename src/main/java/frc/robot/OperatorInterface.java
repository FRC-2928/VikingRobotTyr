package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Command.Chassis.Shift;
import frc.robot.Command.Shooter.RunIntake;
import frc.robot.Command.Shooter.SetLifter;
import frc.robot.Command.Shooter.SetTomahawk;
import frc.robot.Command.Shooter.Shoot;
import frc.robot.Command.Triggers.JoystickAxisButton;
import frc.robot.Subsystem.Chassis.Transmission;
import frc.robot.Subsystem.Shooter.Tomahawk;

public class OperatorInterface {

    private static final XboxController driveControllers = new XboxController(0);

    //Drive
    public static final JoystickButton shiftLow = new JoystickButton(driveControllers, 9);
    public static final JoystickButton shiftHigh = new JoystickButton(driveControllers, 10);

    //Intake
    public static final JoystickButton tomahawkUp = new JoystickButton(driveControllers, 10);
    public static final JoystickButton tomahawkDown = new JoystickButton(driveControllers, 11);
    // public static final JoystickAxisButton intakeIn = new JoystickAxisButton(driveControllers, 2, 0.2);
    // public static final JoystickAxisButton intakeOut = new JoystickAxisButton(driveControllers, 3, 0.2);

    //Shooter positions
    public static final JoystickButton shooterDown = new JoystickButton(driveControllers, 1);
    public static final JoystickButton shooterDrive = new JoystickButton(driveControllers, 2);
    public static final JoystickButton shooterLow = new JoystickButton(driveControllers, 3);
    public static final JoystickButton shooterHigh = new JoystickButton(driveControllers, 4);

    OperatorInterface() {
        
        //Drive
        shiftHigh.whenPressed(new Shift(Transmission.GearState.HIGH));
        shiftLow.whenPressed(new Shift(Transmission.GearState.LOW));

        if(getRightTrigger() > 0.1){
            new Shoot(getRightTrigger());
            new SetTomahawk(Tomahawk.TomahawkState.RAISE);
            driveControllers.setRumble(RumbleType.kLeftRumble, getRightTrigger());
            driveControllers.setRumble(RumbleType.kRightRumble, getRightTrigger());
        }

        //Intake
        if (getLeftTrigger() > 0.1){
            new RunIntake(-getLeftTrigger(),- getLeftTrigger());
            driveControllers.setRumble(RumbleType.kLeftRumble, getLeftTrigger());
            driveControllers.setRumble(RumbleType.kRightRumble, getLeftTrigger());
        }

        // {
        //     CommandGroup group = new CommandGroup();
        //     group.addParallel( new RunIntake(-getLeftTrigger(), -getLeftTrigger()));
        //     group.addParallel(new SetLifter(0));
        //     intakeIn.whenActive(group);
        // }

        if(getPOV() == 0){
            new SetTomahawk(Tomahawk.TomahawkState.RAISE);
        }

        if(getPOV() == 180){
            new SetTomahawk(Tomahawk.TomahawkState.LOWER);
        }

        shooterDown.whenPressed(new SetLifter(0));
        shooterDrive.whenPressed(new SetLifter(0.2));
        shooterLow.whenPressed(new SetLifter(0.5));
        shooterHigh.whenPressed(new SetLifter(0.8));
    }

    public double getDriveY() {
        return driveControllers.getY();
    }

    public double getDriveYL(){
        return driveControllers.getY(Hand.kLeft);
    }

    public double getDriveX() {
        return driveControllers.getX();
    }

    public double getDriveXR(){
        return driveControllers.getX(Hand.kRight);
    }

    public boolean isLeftTriggerPressed(){
        if(driveControllers.getTriggerAxis(Hand.kLeft) > 0) {
            return true;
        }
        return false;
    }

    public double getLeftTrigger(){
        return driveControllers.getTriggerAxis(Hand.kLeft);
    }

    public double getRightTrigger(){
        return driveControllers.getTriggerAxis(Hand.kRight);
    }

    public double getPOV(){
        return driveControllers.getPOV();
    }
}