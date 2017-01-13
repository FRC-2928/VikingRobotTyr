package org.usfirst.frc.team2928.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	// Controller ports (drive station)
	public static int driveJoystickPort = 1;
	public static int opJoystickPort = 2;
	
	// Motors (CAN)
	public static int backLeftDrive = 14;
	public static int backRightDrive = 1; 
	public static int frontLeftDrive = 15;
	public static int frontRightDrive = 0;
	public static int lifterMotor = 4;
	
	// Motors (PWM)
	public static int leftShootMotor = 0;
	public static int rightShootMotor = 1;
	public static int spinnerMotor = 2;
	
	// Solenoids
	public static int tomahawkSolenoid = 1;
	public static int shifterSolenoid = 0;
	public static int shooterSolenoid = 7;
	
	//Gyro
	public static int analogGyro = 0;
	
}
