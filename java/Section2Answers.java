class Week2Answers {
  public static void main(String[] args) {
    // Activity 1: Primitive Variable Assignment
    int myInt = 5;
    char myChar = 'c';
    boolean myBoolean = true;
    double myDouble = 3.14;

    //Activity 2: Outputting Data using System.out
    // Using     System.out.println();
    System.out.println("Activity 2 Summary:");
    System.out.println("  myInt value is " + myInt);
    System.out.println("  myChar value is " + myChar);
    System.out.println("  myBoolean value is " + myBoolean);
    System.out.println("  myDouble value is " + myDouble);


    // Activity 3: Simple Arithmetic Operations
    System.out.println("Activity 3 Summary:");
    System.out.println("  3.1: " + ( 5 + 7 ) );
    System.out.println("  3.2: " + ( 6 - 12 ) );
    System.out.println("  3.3: " + ( 8 * 3 ) );
    System.out.println("  3.4: " + ( 36 / 6 ) );

    // Activity 4: Simple Comparison Operations
    System.out.println("Activity 4 Summary:");
    System.out.println("  4.1: " + ( 7 == 7 ) );
    System.out.println("  4.2: " + ( 7 != 7 ) );
    System.out.println("  4.3: " + !( 7 == 7 ) );

    // Activity 5: Complex Comparison Operations
    System.out.println("Activity 5 Summary:");
    System.out.println("  5.1: " + ( ( 7 == 7 ) == ( 7 != 7) ) );


    // Activity 6: Simple Logical Comparison Operations
    System.out.println("Activity 6 Summary:");
    System.out.println("  6.1: " + ( ( 4 > 3 ) && ( 7 < 13 ) ) );
    System.out.println("  6.2: " + ( ( 4 > 3 ) || ( 7 < 13 ) ) );
  }
}