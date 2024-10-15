#!/usr/bin/env python3

# Simple Statement we are going to use within our loops
simple_statement = "I always do my homework and my chores!"

# Setting the Iteration we are going to use
iterations = 10

# Simple FOR loop
for i in range(iterations):

    # This is the equivalent of the Java code: System.out.println("For Loop Iteration " + i + " : " + simpleStatement);
    print(f"For Loop Iteration {i} : {simple_statement}")


# Looking at the structure of the loop:

# for i in range(iterations):
# ^^^ - This denotes that we would like to run a loop

# for i in range(iterations):
#     ^^^^ - This assigns a value to the variable 'i' from the 'range(iterations)'
#            It acts as a counter for the loop.

# for i in range(iterations):
#             ^^^^^^^^^^^^^^ - This generates a sequence of numbers from 0 up to (but not including) the value of 'iterations'.
#                                    We assigned 'iterations' to 10, so the loop will run as long as 'i' is less than 10.

# for i in range(iterations):
#     ^^^^ - In each iteration of the loop, the variable 'i' takes on the next value in the sequence.

# Incrementing/Decrementing variables:
# i += 1  # Increment or add 1 to the value of i (similar to i++ in Java)
# i -= 1  # Decrement or subtract 1 from the value of i (similar to i-- in Java)

# In advanced cases, there are concepts like pre-increment and post-increment,
# but we'll focus on the basics for now.

# For each iteration, all the code inside the loop will be executed.
# In this case, we're just printing a string, but we could do more complex things.


# Print Blank Lines - this is the same as System.out.println() in Java
print()
print("==================================")
print()


continue_flag = True  # This is how you define a boolean in Python


# Simple WHILE loop
while continue_flag:

    # This is the same as System.out.println("While Loop Iteration : " + simpleStatement);
    print(f"While Loop Iteration : {simple_statement}")

    try:
        # This is the equivalent of the Java code: inputChar = scanner.nextLine().charAt(0);
        input_char = input("Do you want to continue? (y/n)  ").lower()

        # This is the same as the Java code: if (inputChar != 'y' && inputChar != 'Y') {
        if input_char != 'y':
            continue_flag = False
    except Exception:
        print("Invalid Input!")

    print()  # Print a blank line

# WHILE loops are another type of loop we'll explore.

# While FOR loops evaluate an expression (like 'i < iterations' in the previous example),
# WHILE loops are better suited for situations where you don't know in advance how many times
# the loop needs to run.

# Here's how a WHILE loop looks:

# while continue_flag:
# ^^^^^ - This indicates a loop will run.

# while continue_flag:
#         ^^^^^^^^^^^^ - This is where a condition is evaluated.
#                        If the condition is True, the code inside the loop runs.
#                        This is similar to the IF statements we learned before.

# In this example, we're using a boolean variable ('continue_flag'),
# but you can also use a conditional expression directly.

# Example:
# Imagine a game of Jenga where players remove blocks until the tower falls.

# PSEUDO CODE:
#   while tower_is_standing:
#       # Next player removes a block



# BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK



# Activities (No code implementation for these activities)

# ACTIVITY 1: Class discussion (NO CODE) - Think of things that we could use loops?

# ACTIVITY 2: Class discussion (NO CODE) - Explain in basic terms the difference between
#                                          FOR and WHILE loops and when to use them

# ACTIVITY 3: Class Game - Jenga

# ACTIVITY 4: Try it out - Lets look the updated Home Lights Automation code
  # 1. How many loop statements are there in the Automated Lights code?
  # 2. Why did we choose the looping method we did?

# ACTIVITY 5: Try it out - Lets checkout and run our MazeSolver code
  # Although the logic is more complex that what we have seen so far, we can see that
  # through the use of Loops and Conditionals, we can make a character move around a
  # two-dimensional map from a starting point to an ending point.

# ACTIVITY 6: Come up with a unique use case for Looping that we see in our normal day