package org.usfirst.frc.team2928.robot;

import org.usfirst.frc.team2928.robot.commands.IntakeCommand;
import org.usfirst.frc.team2928.robot.commands.LowerShooterCommand;
import org.usfirst.frc.team2928.robot.commands.OuttakeCommand;
import org.usfirst.frc.team2928.robot.commands.RaiseShooterCommand;
import org.usfirst.frc.team2928.robot.commands.ResetShifterCommand;
import org.usfirst.frc.team2928.robot.commands.RotateCommand;
import org.usfirst.frc.team2928.robot.commands.ShiftCommand;
import org.usfirst.frc.team2928.robot.commands.ShootCommand;
import org.usfirst.frc.team2928.robot.commands.SpinnerCommand;
import org.usfirst.frc.team2928.robot.commands.TomahawkCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
@SuppressWarnings("unused")
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	public static Joystick stick = new Joystick(RobotMap.driveJoystickPort);
	public static Joystick otherStick = new Joystick(RobotMap.opJoystickPort);
	
	public static JoystickButton spinUp = new JoystickButton(otherStick, RobotMap.shooterSolenoid);
	public static JoystickButton toggleShift = new JoystickButton(stick, 1);
	//public static JoystickButton resetButton = new JoystickButton(stick, 8);
	
	//temporary
	public static JoystickButton raiseLifterButton = new JoystickButton(stick, 7);
	public static JoystickButton lowerLifterButton = new JoystickButton(stick, 6);
	public static JoystickButton intakeButton = new JoystickButton(stick, 10);
	public static JoystickButton outtakeButton = new JoystickButton(stick, 11);
	public static JoystickButton shootButton = new JoystickButton(stick, 2);
	
	public static JoystickButton lowerTomahawkButton = new JoystickButton(stick, 5);
	public static JoystickButton raiseTomahawkButton = new JoystickButton(stick, 4);
	
	public static JoystickButton spinnerButton = new JoystickButton(stick, 3);
	
	public static JoystickButton pidButton = new JoystickButton(stick, 8 );
	static {
		toggleShift.whenPressed(new ShiftCommand());
		//resetButton.whenPressed(new ResetShifterCommand());
		raiseLifterButton.whileHeld(new RaiseShooterCommand());
		lowerLifterButton.whileHeld(new LowerShooterCommand());
		intakeButton.whileHeld(new IntakeCommand());
		outtakeButton.whileHeld(new OuttakeCommand());
		shootButton.whileHeld(new ShootCommand());
		lowerTomahawkButton.whenPressed(new TomahawkCommand(false));
		raiseTomahawkButton.whenPressed(new TomahawkCommand(true));
		spinnerButton.whileHeld(new SpinnerCommand());
		pidButton.whenPressed(new RotateCommand());
	}
}

