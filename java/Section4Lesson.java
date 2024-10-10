public class Section4Lesson {

  public static void main(String[] args) {
    // Conditional Programming

    // Reviewing Primitive Boolean Data Types:
    boolean lightsOn = true;   // This can be set to   true or false
    System.out.println("Value of lightsOn variable: " + lightsOn);

    /*
    *  Are the lights on?
    *
    * Well yes, they are and we can tell by the simple boolean
    * value being set to true
    *
    * Boolean values are great ways to easily determine a condition
    * because it can only ever be true or false
    *
    * But boolean's don't have a nice and pretty output other than
    * just true or false.
    *
    * So our first example, we will use the boolean to print a
    * more informative nice statement
    */
     System.out.print("1st Conditional: ");

    if ( lightsOn ) {
      System.out.println("The lights in the room are on");
    }

    /*
    *   if ( lightsOn ) {
    *     System.out.println("The lights in the room are on");
    *   }
    *
    *  So we first look at the IF line
    *
    *  if ( lightsOn ) {
    *       ^^^^^^^^ - This is the condition and the IF statement is looking
    *                  to evaluate to TRUE
    *                  Since we are using a boolean (true / false) this condition
    *                  is very simple to read.
    *                  IF lightsOn == true  (Remember back to Conditional Operators in Subject2)
    *
    *
    *  Lets look at the structure of a conditional
    *
    *    if ( lightsOn ) {      <- So we see a { - Referred to as OPEN CURLY BRACE
    *      ...                        <- Code to be executed when the condition is met
    *    }                      <- So we see a } - Referred to as CLOSE CURLY BRACE
    */

    lightsOn = false;  // Remember, we don't need the variable data type when reassigning

    /*
    *  So now that lightsOn is set to false, our conditional isn't met and therefore
    *  it wouldn't print anything right?
    *
    *  We need to modify the conditional to handle this case.
    */

    System.out.print("2nd Conditional: ");

    if ( lightsOn ) {
      System.out.println("The lights in the room are on");
    } else {
      System.out.println("The lights in the room are off");
    }

    /*
    *
    *  With this logic we now handle both cases of a boolean right?
    *  IF true - Output "Lights are On"
    *  Else - Output "Lights are Off"
    *
    *  It's a light switch, so it can only ever be On or Off, so we only have
    *  options for two outputs
    *
    *
    *  Looking at the structure:
    *
    *   if ( lightsOn ) {
    *     ...               <- Code to run if Condition is met
    *   } else {
    *     ...               <- Code to run if Condition is not met
    *   }
    */

    /*  So why is this important? More so why would we do this?
    *
    *   Well, a conditional in our simple boolean example just helps us
    *   to output a pretty statement for the user, but what if we were
    *   to expand upon our simple example to create smart home automation?
    */

    boolean roomOccupied = false;
    lightsOn = true;

    /*
    *  Now we've introduced another boolean variable
    *
    *  We now have the status of the lights in the room
    *  And we have whether the room is occupied
    *
    *  We could create a smart-home-automation to do some really cool things
    *  given certain conditional circumstances right?
    *
    *  So we can use our logical operators from Subject 2
    *  && - Logical AND
    *  || - Logical OR
    *  !  - Logical NOT
    *
    *  Pseudo code:
    *  1. IF ((lights == On) && (occupation == Unoccupied)) - Turn the lights off
    *  2. ELSE IF ((lights == off) && (occupation == Occupied)) - Turn the lights on
    *  3. ELSE  - Remember there's no conditional with ELSE - Leave the lights the way they are
    *
    * So the logic would look like this
    *
    *   if ( lightsOn && !roomOccupied ) {         <- Our first condition
    *     ...
    *   } else if ( !lightsOn && roomOccupied ) {  <- Our second condition
    *     ...
    *   } else {                                   <- Our catch-all condition
    *     ...
    *   }
    *
    *
    *   Consider the following:
    *   lightsOn = true
    *   roomOccupied = false
    *
    *   So if we look at the IF statement, we see ( lightsOn && !roomOccupied )
    *                                                           ^
    *    Replace variables with values                TRUE   && !FALSE
    *    Implement Logical NOT                        TRUE   && TRUE
    *
    *    So we now look at our Logical AND outcomes:
    *
    *    TRUE   &&  TRUE   = TRUE
    *    TRUE   &&  FALSE  = FALSE
    *    FALSE  &&  TRUE   = FALSE
    *    FALSE  &&  FALSE  = FALSE
    *
    *   So be careful of Logical NOT conditionals
    */

    lightsOn = false;
    roomOccupied = true;

    if ( lightsOn && !roomOccupied ) {
      System.out.println("We should turn the lights off because the room is empty");
    } else if ( !lightsOn && roomOccupied ) {
      System.out.println("We should turn the lights on because the room is occupied");
    } else {
      System.out.println("Lets just leave the lights alone");
    }

    /*
    *  So our else condition could cover the following two situations:
    *   - LightsOff && RoomEmpty     - We would want to leave the lights alone
    *   - LightsOn  && RoomOccupied  - We would want to leave the lights alone
    */

    // BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK

    // Activities

    // ACTIVITY 1: Class discussion (NO CODE) - Think of things that we could use conditionals for?

    // ACTIVITY 2: Class Game (NO CODE) - Bluey Musical Statues Game

    // ACTIVITY 3: Try it out - Home Lights Automation code
      // 1. How many conditional statements are there in the Automated Lights code?
      // 2. If the following is input, what would the results be?
      //    a. Hour = 13
      //    b. lightStatus = On   ( lightStatus = true )
      //    c. isOccupied = No    ( isOccupied = false )

    // ACTIVITY 4: Watching StarWars Movies
      // Try without running the code to determine the answers to the following questions
      // Remember Movies are 1-11 and each movie will fall into a category
      // 1. Best Movie:
      // 2. Great Movie(s):
      // 3. Alright Movie(s):
      // 4. Awful Movie(s):

    // ACTIVITY 5: Come up with a unique Conditional, and all of its available outcomes
      // Remember, we used simple booleans in class, we don't need to get too complicated
  }
}
