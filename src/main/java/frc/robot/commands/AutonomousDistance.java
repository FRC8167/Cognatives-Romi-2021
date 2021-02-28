// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousDistance(Drivetrain drivetrain) {
    addCommands(
        new DriveDistance(0.6, 14.7, drivetrain),
        new TurnDegrees(-0.4, 73.5, drivetrain),
        new DriveDistance(0.6, 17.3, drivetrain),
        new TurnDegrees(-0.4, 101, drivetrain),
        new DriveDistance(0.6, 26, drivetrain),
        new TurnDegrees(0.4, 101, drivetrain),
        new DriveDistance(0.7, 15.7, drivetrain),
        new TurnDegrees(0.4, 79, drivetrain),
        new DriveDistance(0.6, 15, drivetrain)
        );
  }
}
