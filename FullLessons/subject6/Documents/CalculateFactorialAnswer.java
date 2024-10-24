package com.hse.programming;

import java.util.Scanner;

public class CalculateFactorial {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Solving for the Factorial of user input");
    System.out.println("Example:  !4 = ( 4 * 3 * 2 * 1 ) = 24 ");

    System.out.print("(Integer) Enter an value:  ");
    int inputValue = input.nextInt();
    System.out.println();

    // Begin Algorithm
    int result = 1;

    for (int i = inputValue; i > 0; i--) {
      result = result * i;  // Multiply the currentResult by the iteration value
    }

    // End Algorithm

    System.out.println("!" + inputValue + " = " + result);
  }
}
