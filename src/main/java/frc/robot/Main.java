/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

/** <b>Do NOT modify this file for any reason.</b> */
public final class Main {
  private Main() {}

  /** Main initialization function. Do not perform any initialization here. */
  public static void main(String... args) {
    RobotBase.startRobot(Robot::new);
  }
}
