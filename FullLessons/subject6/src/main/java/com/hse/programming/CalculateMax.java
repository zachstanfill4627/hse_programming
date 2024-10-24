package com.hse.programming;

import java.util.Scanner;

public class CalculateMax {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter three numbers ( Example: 56 32 72 )");
    System.out.println("Press Enter to continue");

    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();

    int max = num1; // Assume num1 is the largest initially

    if (num2 > max) {
      max = num2; // Update max if num2 is larger
    }

    if (num3 > max) {
      max = num3; // Update max if num3 is larger
    }

    System.out.println("The largest number is: " + max);
  }
}