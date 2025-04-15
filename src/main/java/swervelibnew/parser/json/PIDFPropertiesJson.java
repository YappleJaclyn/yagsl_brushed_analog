package swervelibnew.parser.json;

import swervelibnew.parser.PIDFConfig;

/**
 * {@link swervelibnew.SwerveModule} PID with Feedforward for the drive motor and angle motor.
 */
public class PIDFPropertiesJson
{

  /**
   * The PIDF with Integral Zone used for the drive motor.
   */
  public PIDFConfig drive;
  /**
   * The PIDF with Integral Zone used for the angle motor.
   */
  public PIDFConfig angle;
}
