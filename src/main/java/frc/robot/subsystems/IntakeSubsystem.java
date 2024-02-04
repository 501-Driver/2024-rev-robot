package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public IntakeSubsystem() {}
   
   private CANSparkMax speedController1 = new CANSparkMax(55,MotorType.kBrushless);
   private CANSparkMax speedController2 = new CANSparkMax(60,MotorType.kBrushless);

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
     

      }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public void RunIntake() {
    // Query some boolean state, such as a digital sensor.
    speedController1.set(-1);
    speedController2.set(-1); 
  }

  public void RunEject(){
    ///   TODO 
    speedController1.set(1);
    speedController2.set(1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public void Default(){
  speedController1.set(0);
  speedController2.set(0); 
  }

}