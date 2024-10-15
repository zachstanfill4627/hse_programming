package com.com.hse.programming;

import java.util.Scanner;

public class AutomatedLights {

  /**
   * Variables:
   * int hour              - 00-24 hours time of day
   *                                (NOTE: 24 resets to 00, but we need an upper limit)
   * boolean lightStatus   - Simple Yes / No - Are the Lights On?
   * boolean isOccupied    - Simple Yes / No - Is the Room Occupied?
   *
   * Conditions for Lighting Automation
   * Turn Lights Off:
   * 1. If the room is unoccupied, the lights should be shut off
   *
   * Turn Lights On:
   * 1. Time of Day must be between
   *    a. 0 - 7     - Translates to 12am - 7am
   *    b. 17 - 24   - Translates to 5pm - 12am
   *
   * 2. The room is Occupied
   *
   *
   * Under all other circumstances, the lights should be turned off
   */
  public static void main(String[] args) throws InterruptedException {
    // Initialize Keyboard Input for Users
    Scanner keyboard = new Scanner(System.in);


    // Initialize or Declare variables
    int hour = 0;
    boolean lightStatus = false;
    boolean isOccupied = false;

    System.out.println("Should we turn the lights off?");

    // Print Blank Line

    while (true) {          // Essentially we want the loop to always run

      // Begin Asking Questions:
      System.out.print("(Integer) What time of day is it? (In Hours - 0-24)  ");
      hour = keyboard.nextInt();

      // Conditional - Hour Validation
      if (hour < 0 || hour > 24) {
        System.out.println("Invalid Hour Input - Hours Input accepts 0-24");
        System.exit(1);
      }

      // Conditional to set isNightTime - Remember we only want
      // lighting automation between certain hours of the day
      boolean isNightTime = false;
      if ((hour >= 0 && hour <= 7) || (hour >= 17 && hour <= 24)) {
        isNightTime = true;
      }

      System.out.print("(Boolean) Are the Lights Currently On? (true / false)  ");
      lightStatus = keyboard.nextBoolean();

      System.out.print("(Boolean) Is the room currently Occupied? (true / false)  ");
      isOccupied = keyboard.nextBoolean();


      // Print Blank Line
      System.out.println();

      // Conditional IF room is unoccupied
      if (lightStatus && !isOccupied) {
        System.out.println("The lights are on and the room is unoccupied, we should turn the lights off");
      } else {
        if (isNightTime && !lightStatus && isOccupied) {
          System.out.println("We can turn the lights on because its night time and the room is occupied");
        } else {
          System.out.println("We should leave the lights the way they are");
        }
      }

      // System Sleep (or wait)
      Thread.sleep(10000);  // 10 seconds

      // Print Blank Lines
      System.out.println();
      System.out.println("===============================");
      System.out.println();
    }
  }
}
