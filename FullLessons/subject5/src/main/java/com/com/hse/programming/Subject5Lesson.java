package com.com.hse.programming;

import java.util.Scanner;

public class Subject5Lesson {

  public static void main(String[] args) {
    // Looping Programming

    // Keyboard Scanner
    Scanner scanner = new Scanner(System.in);

    // Simple Statement we are going to use within our loops
    String simpleStatement = "I always do my homework and my chores!";

    // Setting the Iteration we are going to use
    int iterations = 10;

    // Simple FOR loop
    for ( int i = 0; i < iterations; i++ ) {
      System.out.println("For Loop Iteration " + i + " : " + simpleStatement);
    }

    /*
    *  Looking at the structure of the loop:
    *
    * for ( int i = 0 ; i < iterations ; i++ ) {
    * ^^^ - This denotes that we would like to run a loop
    *
    * for ( int i = 0 ; i < iterations ; i++ ) {
    *       ^^^^^^^^^ - This is the assignment of a simple integer variable
    *                   We do this because its essentially a counter, for running
    *                   the loop
    *
    * for ( int i = 0 ; i < iterations ; i++ ) {
    *                   ^^^^^^^^^^^^^^ - This is a simple Comparison
    *                                    In an earlier stage, we assigned iterations to 10
    *                                    So as long a variable i is less than 10, the loop will run
    *
    * for ( int i = 0 ; i < iterations ; i++ ) {
    *                                    ^^^ - Increment i
    *
    * Incrementing / Decrementing variables - This just means Adding 1 or Subtracting 1 from the value
    * i++ = Increment or add 1 to value of i
    * i-- = Decrement or subtract 1 from value of i
    *
    * In advanced cases there is such a thing as pre-increment and post-increment
    * and the same with pre-decrement and post-decrement, however we are just going
    * to learn the basics for now.
    *
    * For each iteration, all code inside the loop will be executed. In this instance we are just
    * printing a String, however we could do more complex code.
    */

    // Print Blank Lines
    System.out.println();
    System.out.println("==================================");
    System.out.println();

    boolean continueFlag = true;
    char inputChar = ' ';

    // Simple WHILE loop
    while (continueFlag) {

      System.out.println("While Loop Iteration : " + simpleStatement);
      System.out.print("Do you want to continue? (y/n)  ");
      try {
        inputChar = scanner.nextLine().charAt(0);
        if (inputChar != 'y' && inputChar != 'Y') {
          continueFlag = false;
        }
      } catch (Exception e) {
        System.out.println("Invalid Input!");
      }
      System.out.println();
    }

    /*
    * WHILE loops are another form of loops that we are going to look at in this lesson.
    *
    * Although FOR loops also evaluate an expression, in the case above it was ( i < increments ),
    * while loops are intended for situations where there are an unforeseen number of loops that
    * need to occur
    *
    * So we see
    *
    * while ( continueFlag ) {
    * ^^^^^ - This denotes that a loop of code needs to occur
    *
    * while ( continueFlag ) {
    *         ^^^^^^^^^^^^ - This is the section where the code needs to evaluate a boolean to
    *                        true, if the code is to be executed in a loop, similar to the IF
    *                        conditionals we worked with in the previous lesson.
    *
    * Although we are using a boolean variable in the example above, you could also put a
    * conditional expression
    * IE:
    *   Lets think about the game of Jenga or Towering Blocks whereby players will take
    *   turns removing blocks until the tower falls over.
    *
    * **PSEUDO CODE**
    *    while ( towerPosition == standing ) {
    *       **Next Player removes block**
    *    }
    */

    // BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK

    // Activities

    // ACTIVITY 1: Class discussion (NO CODE) - Think of things that we could use loops?

    // ACTIVITY 2: Class discussion (NO CODE) - Explain in basic terms the difference between
    //                                          FOR and WHILE loops and when to use them

    // ACTIVITY 3: Class Game - Jenga

    // ACTIVITY 4: Try it out - Lets look the updated Home Lights Automation code
      // 1. How many loop statements are there in the Automated Lights code?
      // 2. Why did we choose the looping method we did?

    // ACTIVITY 5: Try it out - Lets checkout and run our MazeSolver code
      // Although the logic is more complex that what we have seen so far, we can see that
      // through the use of Loops and Conditionals, we can make a character move around a
      // two-dimensional map from a starting point to an ending point.

    // ACTIVITY 6: Come up with a unique use case for Looping that we see in our normal day

  }
}
