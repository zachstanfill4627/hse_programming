package com.hse.programming;

public class ServiceApplication2 {

    public static void main(String[] args) {

        // Introduction to Primitive Data Types:
        System.out.println("Primitive Data Types");

        // Boolean - Think about a light switch, its either ON or OFF
        boolean isRaining = true; // Can be either true or false.
        // Make note that boolean's don't have " " around the value
        System.out.println("It is raining = " + isRaining);

        // Print Blank Line
        System.out.println();

        // Integer - Simple whole numbers   -2,147,483,648 to 2,147,483,647
        int temperature = 75;
        System.out.println("The temperature = " + temperature);

        temperature = 76;
        System.out.println("The temperature = " + temperature);

        /**
         * Looking into the components of variable assignments:
         *
         * int temperature = 75;
         * ^^^ - This is the variable type
         *
         * int temperature = 75;
         *     ^^^^^^^^^^^ - This is the variable name, or how we will call it later
         *
         * int temperature = 75;
         *                   ^^ - This is the variable value we are setting
         *
         *
         * temperature = 76;
         * ^^^ - Notice when I reassign the value,
         *       I don't put the TYPE in front. Once a TYPE has been defined, it cannot
         *       change, so we don't need to define it when we reassign the variable
         */

        // Double - Decimal Numbers (We won't be using this)
        double accurateTemperature = 75.25;
        System.out.println("The accurate temperature = " + accurateTemperature);

        // Print Blank Line
        System.out.println();

        // Character - A single Alpha-Numeric or Special Character
        char favoriteLetter = 'Z';
        System.out.println("My favorite letter is " + favoriteLetter);

        /**
         * Notice there is a difference in the variable assignment for Characters
         *
         * char favoriteLetter = 'Z';
         *                       ^ ^ - The ' ' characters surround the character
         *                             (We call this SINGLE QUOTES)
         *                             ' ' denote that we are assigning a LITERAL
         *                             value meaning we want favoriteLetter
         *                             to equal EXACTLY Z
         */

        // Print Blank Line
        System.out.println();

        // BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK

        // Arithmetic Operators
        System.out.println("Arithmetic Operators");

        /**
         *   +   |   Addition         |  5 + 3  (8)
         *   -   |   Subtraction      |  5 - 3  (2)
         *   *   |   Multiplication   |  5 * 3  (15)
         *   /   |   Division         |  5 / 3  (1)   - Remember, INTEGERS are WHOLE numbers,
         *                                              even though 5 / 3 = 1.6667,
         *                                              the integer value is 1
         */

        int integer1 = 5;
        int integer2 = 3;
        System.out.println("integer1 + integer2 = " + (integer1 + integer2) );
        System.out.println("integer1 - integer2 = " + (integer1 - integer2) );
        System.out.println("integer1 * integer2 = " + (integer1 * integer2) );
        System.out.println("integer1 / integer2 = " + (integer1 / integer2) );

        // Print Blank Line
        System.out.println();

        // BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK

        // Comparison Operators
        System.out.println("Comparison Operators");

        /**
         *    ==   |   Equal to                   |
         *    !=   |   Not equal to               |
         *     >   |   Greater than               |
         *     <   |   Less than                  |
         *    >=   |   Greater than or equal to   |
         *    <=   |   Less than or equal to      |
         */

        int integer3 = 15;
        int integer4 = 15;
        int integer5 = 18;
        int integer6 = 13;

        // ==   |  Equal to
        System.out.println("==  |  Equal to");
        System.out.println(integer3 + " == " + integer4 + " is " + (integer3 == integer4) );
        System.out.println(integer3 + " == " + integer5 + " is " + (integer3 == integer5) );

        // Print Blank Line
        System.out.println();

        // !=  |   Not equal to
        System.out.println("!=  |  Not equal to");
        System.out.println(integer3 + " != " + integer4 + " is " + (integer3 != integer4) );
        System.out.println(integer3 + " != " + integer5 + " is " + (integer3 != integer5) );

        // Print Blank Line
        System.out.println();

        // >  |   Greater than
        System.out.println(">  |  Greater than");
        System.out.println(integer3 + " > " + integer4 + " is " + (integer3 > integer4) );
        System.out.println(integer3 + " > " + integer5 + " is " + (integer3 > integer5) );

        // Print Blank Line
        System.out.println();

        // >  |   Greater than
        System.out.println("<  |  Less than");
        System.out.println(integer3 + " < " + integer4 + " is " + (integer3 < integer4) );
        System.out.println(integer3 + " < " + integer5 + " is " + (integer3 < integer5) );

        // Print Blank Line
        System.out.println();

        // >=  |   Greater than or equal to
        System.out.println(">=  |  Greater than or equal to");
        System.out.println(integer3 + " >= " + integer4 + " is " + (integer3 >= integer4) );
        System.out.println(integer3 + " >= " + integer5 + " is " + (integer3 >= integer5) );
        System.out.println(integer3 + " >= " + integer6 + " is " + (integer3 >= integer6) );

        // Print Blank Line
        System.out.println();

        // >=  |   Greater than
        System.out.println("<=  |  Less than or equal to");
        System.out.println(integer3 + " <= " + integer4 + " is " + (integer3 <= integer4) );
        System.out.println(integer3 + " <= " + integer5 + " is " + (integer3 <= integer5) );
        System.out.println(integer3 + " <= " + integer6 + " is " + (integer3 <= integer6) );

        // BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK

        // Logical Operators
        System.out.println("Logical Operators");

        /**
         *    &&   |   LOGICAL AND   |
         *    ||   |   LOGICAL OR    |
         *    !    |   LOGICAL NOT   |
         */

        int integer7 = 5;
        int integer8 = 5;
        int integer9 = 9;
        int integer10 = 10;

        System.out.println("Conditional Expression 1 : (" +
            integer7 + " == " + integer8 + ") is " + (integer7 == integer8) );

        System.out.println("Conditional Expression 2 : (" +
            integer9 + " == " + integer10 + ") is " + (integer9 == integer10) );

        // What happens if we put them together?

        // &&  |  Logical AND
        System.out.println("&&  |  Logical AND");
        System.out.println(
            "(" + integer7 + " == " + integer8 + ") && " +
                "(" + integer9 + " == " + integer10 + ") is " +
                ((integer7 == integer8) && (integer9 == integer10)) );

        // Print Blank Line
        System.out.println();

        //  ||  |  Logical OR
        System.out.println("||  |  Logical OR");
        System.out.println("(" + integer7 + " == " + integer8 + ") || " +
            "(" + integer9 + " == " + integer10 + ") is " +
            ((integer7 == integer8) || (integer9 == integer10)) );

        // Print Blank Line
        System.out.println();

        // !  |  Logical NOT
        System.out.println("!  |  Logical NOT");
        System.out.println("(" + integer7 + " == " + integer8 + ") is " + (integer7 == integer8) );
        System.out.println("!(" + integer7 + " == " + integer8 + ") is " + !(integer7 == integer8) );

        // BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK


        /**
         * Activity Code Goes Here
         */

        // Activity 1: Primitive Variable Assignment

        //Activity 2: Outputting Data using System.out
        // Using     System.out.println();
        System.out.println("Activity 2 Summary:");
        System.out.println("  myInt value is ");
        System.out.println("  myChar value is ");
        System.out.println("  myBoolean value is ");
        System.out.println("  myDouble value is ");


        // Activity 3: Simple Arithmetic Operations
        System.out.println("Activity 3 Summary:");
        System.out.println("  3.1: ");
        System.out.println("  3.2: ");
        System.out.println("  3.3: ");
        System.out.println("  3.4: ");

        // Activity 4: Simple Comparison Operations
        System.out.println("Activity 4 Summary:");
        System.out.println("  4.1: ");
        System.out.println("  4.2: ");
        System.out.println("  4.3: ");

        // Activity 5: Complex Comparison Operations
        System.out.println("Activity 5 Summary:");
        System.out.println("  5.1: ");


        // Activity 6: Simple Logical Comparison Operations
        System.out.println("Activity 6 Summary:");
        System.out.println("  6.1: ");
        System.out.println("  6.2: ");
    }
}
