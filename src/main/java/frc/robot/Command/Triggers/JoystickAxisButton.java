package frc.robot.Command.Triggers;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 *
 */
public class JoystickAxisButton extends Trigger {
	
	public XboxController joy;
	public int axis;
	public double completionCritera;
	
	public JoystickAxisButton(XboxController _joy, int _axis, double _completionCritera){
		joy = _joy;
		axis = Math.abs(_axis);
		completionCritera = _completionCritera;
	}
	
    public boolean get() {
    		return joy.getRawAxis(axis) > completionCritera;
    }
}