package com.hse.programming;

import java.util.Scanner;

public class Subject6Lesson {

  public static void main(String[] args) {
    // Algorithms

    // Algorithm are a set of step-by-step instructions or rules
    // designed to solve a specific problem or accomplish a particular task.

    // As we discussed in class, Algorithms are similar to that of a cooking
    // recipe, or steps to complete a household chore

    /* If we think about doing laundry, we can break it into the following steps:
    *    1. Collect Dirty Laundry
    *    2. Place in Washing Machine
    *    3. Add Detergent (And other cleaners/softeners)
    *    4. Start washing machine
    *    5. While ( WashingMachine is Running ) - Wait
    *    6. Remove clothes from Washing Machine
    *    7. For each item:
    *       a. IF ( sensitiveItem) - Hang dry
    *       b. ELSE - Place in dryer
    *    8. Add Dryer Sheets to dryer
    *    9. Start Dryer
    *   10. While ( Dryer is Running ) - Wait
    *   11. Remove clothes from Dryer
    *   12. Fold Dry Clothing
    *   13. Put away folded clean clothes into proper drawers
    *
    *  This beings algorithms into simple easy to understand steps that we can see
    *  in our day-to-day lives.
    */

    // What if we go back to math class for a minute and look at solving a
    // Pythagorean Theorem question ( a^2 + b^2 = c^2 )

    Scanner input = new Scanner(System.in);

    System.out.println("Steps to solve a Pythagorean Theorem question are well defined");
    System.out.println("a^2 + b^2 = c^2");
    System.out.println();
    System.out.println("We will be solving for c in this example");
    System.out.println();

    // Begin Algorithm (Gather Value A and Value B)
    System.out.print("(Double) Enter the length of the first leg (a): ");
    double a = input.nextDouble();
    System.out.println();

    System.out.print("(Double) Enter the length of the second leg (b): ");
    double b = input.nextDouble();
    System.out.println();

    // Calculate Squared Values of Value A and Value B
    double aSquared = a * a;
    double bSquared = b * b;

    // Assign c^2 Value to a^2 + b^2
    double cSquared = aSquared + bSquared;

    // Find Square Root of c^2
    double c = Math.sqrt(cSquared);
    // End Algorithm

    System.out.println("The length of the hypotenuse (c) is: " + c);

    // As we can see here, These are well-defined mathematical steps
    // Solving for c using the Pythagorean Theorem will always use the same steps
    // in the same order.

    // Print Blank Lines to separate lesson sections
    System.out.println();
    System.out.println("==============================");
    System.out.println();

    // Now lets look at solving a mathmatical FOIL problem.
    // Remember FOIL? ( First, Outer, Inner, Last )
    // The FOIL method is a way to multiple two binomials.
    // The problem looks like this:  ( a + b ) ( x + y )

    System.out.println("Solving a mathmatical FOIL Problem  ( a + b ) ( x + y )");
    System.out.println();

    // Begin Algorithm

    // Gather Values
    System.out.print("(Integer) Enter the value of a:  ");
    int a1 = input.nextInt();
    System.out.println();

    System.out.print("(Integer) Enter the value of b:  ");
    int b1 = input.nextInt();
    System.out.println();

    System.out.print("(Integer) Enter the value of x:  ");
    int x2 = input.nextInt();
    System.out.println();

    System.out.print("(Integer) Enter the value of y:  ");
    int y2 = input.nextInt();
    System.out.println();


    // Calculate Stage Values
    int first = a1 * x2;
    int outer = a1 * y2;
    int inner = b1 * x2;
    int last = b1 * y2;

    // Calculate Result
    int result = first + outer + inner + last;

    // End Algorithm

    System.out.println("(" + a1 + " + " + b1 + ") (" + x2 + " + " + y2 + ") = " + result);

    // Similarly, we are able to use an algorithm to calculate the result of a
    // mathematical FOIL problem.

    // Print Blank Lines to separate lesson sections
    System.out.println();
    System.out.println("==============================");
    System.out.println();

    // Activities Section

    // ACTIVITY 1: Class Discussion (NO CODE) - Define something from your day-to-day
    //                                          that you can use an algorithm to solve

    // ACTIVITY 2: Class Activity (NO CODE) - When do algorithms not work?
    //                                        We are going to come up with a set of movement actions
    //                                        that a fellow-classmate will preform

    // ACTIVITY 3: Class Activity (NO CODE) - Solving a Rubix Cube

    // ACTIVITY 4: See it        - Review FindMax Code

    // ACTIVITY 5: Understand it - Review CalculateAverage Code

    // ACTIVITY 6: Do it         - Write CalculateFactorial Code

    // ACTIVITY 7: What are some other things that we could write algorithms for? Lets just think
    //             about different problems that we've seen in Math
  }

}
