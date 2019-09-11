package frc.robot.Subsystem.Chassis;

import com.ctre.phoenix.ErrorCode;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.RobotConstants;

public class VikingSRX extends WPI_TalonSRX {

    private int pointsSent;
    public VikingSRX(int port)
    {
        super(port);
        reset();
        setGains(new SRXGains(0,0,0,0));
        pointsSent = 0;
    }

    public void zeroEncoder()
    {
        setSelectedSensorPosition(0,0, RobotConstants.CAN_TIMEOUT_MS);
    }

    public void setGains(SRXGains gains)
    {
        config_kP(0, gains.p, RobotConstants.CAN_TIMEOUT_MS);
        config_kI(0, gains.i, RobotConstants.CAN_TIMEOUT_MS);
        config_kD(0, gains.d, RobotConstants.CAN_TIMEOUT_MS);
        config_kF(0, gains.f, RobotConstants.CAN_TIMEOUT_MS);
    }

    public void reset()
    {
        set(ControlMode.PercentOutput, 0);
        clearMotionProfileTrajectories();
        zeroEncoder();
        pointsSent = 0;
    }

    public int getEncoderPosition()
    {
        return getSelectedSensorPosition(0);
    }

    public int getEncoderVelocity()
    {
        return getSelectedSensorVelocity(0);
    }
}