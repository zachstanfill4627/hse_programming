#!/usr/bin/env python3

# Import Statements

# Introduction to Python Primitive Data Types:
print("Primitive Data Types")

# Boolean - Think about a light switch, its either ON or OFF
isRaining = True   # Can be either true or false.
# Make note that boolean's don't have " " around the value
print("It is raining = ", isRaining)

# Print Blank Line
print()

# Integer - Simple Whole Numbers
temperature = 75   # Declaring and setting the variable
print("The temperature = ", temperature)

temperature = 76   # Setting a variable thats already been declared
print("The temperature = ", temperature)


# Looking into the components of variable assignments:
#
# temperature = 75
# ^^^^^^^^^^^ - This is the variable name, or how we will call it later
#
# temperature = 75
#               ^^ - This is the variable value we are setting
#
#
# temperature = 76
#    - This is reassigning the value of the vim_variables
#
#      Note, that variable declaration and assignment in python is different from
#      Java. This is because Java requires strict adherence to well-defined structure
#      while python was designed to be more fluid and user-friendly. The user-friendly
#      is why we don't need variable type declaration which also allows developers to
#      transition between data types like Integers (int) and Doubles/Float's as an example.
#
#      However, with less structure means there's a higher possibility of data type
#      misusages later in the code.

# Double - Decimal Numbers
accurateTemperature = 75.25
print("The accurate temperature = ", accurateTemperature)

# Print Blank Line
print()

# As mentioned, python doesn't require strict adherence to data types like java does
### THIS IS REFERRED TO AS DYNAMIC TYPING ###
exampleNum = 75      # Effectively declared as an Integer data type
print("Example Number Value: ", exampleNum)
exampleNum = 75.25   # Effectively reassigned to be a Double/Float data type
print("Example Number Value: ", exampleNum)


# Print Blank Line
print()

# Characters - A single Alpha-Numeric or Special Character
favoriteLetter = 'Z'
print("My favorite letter is ", favoriteLetter)

# Print Blank Line
print()

# BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK

# Arithmetic Operators
print("Arithmetic Operators")

#  +   |   Addition          |  5 + 3   (8)
#  -   |   Subtraction       |  5 - 3   (2)
#  *   |   Multiplication    |  5 * 3   (15)
#  /   |   Division          |  5 / 3   (1.6667)   - Here's what is cool about python's
#                                                    dynamic data typing. Despite the fact
#                                                    that we are dealing with Integers (Whole Numbers)
#                                                    The actual or real answer to 5 / 3 is a
#                                                    double / float value

integer1 = 5
integer2 = 3
print("integer1 + integer2 = ", (integer1 + integer2))
print("integer1 - integer2 = ", (integer1 - integer2))
print("integer1 * integer2 = ", (integer1 * integer2))
print("integer1 / integer2 = ", (integer1 / integer2))

# Print Blank Line
print()

# BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK

# Comparison Operators
print("Comparison Operators")

#   ==   |   Equal To
#   !=   |   Not equal to
#    >   |   Greater than
#    <   |   Less than
#   >=   |   Greater than or equal to
#   <=   |   Less than or equal to

integer3 = 15
integer4 = 15
integer5 = 18
integer6 = 13

#  ==  | Equal to
print("== | Equal to")
print(integer3, " == ", integer4 , " is ", (integer3 == integer4) )
print(integer3, " == ", integer5 , " is ", (integer3 == integer5) )

# Print Blank Line
print()

#  !=  | Not equal to
print("!= | Not equal to")
print(integer3, " != ", integer4 , " is ", (integer3 != integer4) )
print(integer3, " != ", integer5 , " is ", (integer3 != integer5) )

# Print Blank Line
print()

#  >   | Greater than
print("> | Greater than")
print(integer3, " > ", integer4 , " is ", (integer3 > integer4) )
print(integer3, " > ", integer5 , " is ", (integer3 > integer5) )

# Print Blank Line
print()

#  <   | Less than
print("< | Less than")
print(integer3, " < ", integer4 , " is ", (integer3 < integer4) )
print(integer3, " < ", integer5 , " is ", (integer3 < integer5) )

# Print Blank Line
print()

#  >=   | Greater than or equal to
print(">= | Greater than or equal to")
print(integer3, " >= ", integer4 , " is ", (integer3 >= integer4) )
print(integer3, " >= ", integer5 , " is ", (integer3 >= integer5) )
print(integer3, " >= ", integer6 , " is ", (integer3 >= integer6) )

# Print Blank Line
print()

#  <=   | Less than or equal to
print("< | Less than or equal to")
print(integer3, " <= ", integer4 , " is ", (integer3 <= integer4) )
print(integer3, " <= ", integer5 , " is ", (integer3 <= integer5) )
print(integer3, " <= ", integer6 , " is ", (integer3 <= integer6) )

# Print Blank Line
print()

# BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK

# Logical Operators
print("Logical Operators")

#   and  |  Logical AND
#   or   |  Logical OR
#   not  |  Logical NOT
#                        - It's important to note how the syntax is different from Java
#                          however, the resulting operation is still going to be the same

integer7 = 5
integer8 = 5
integer9 = 9
integer10 = 10

print("Conditional Expression 1 : (", integer7, " == ", integer8, ") is ", (integer7 == integer8))
print("Conditional Expression 1 : (", integer9, " == ", integer10, ") is ", (integer9 == integer10))

# Print Blank Line
print()

# and | Logical AND
print("and  |  Logical AND")
print("(", integer7, " == ", integer8, ") and (", integer9, " == ", integer10, ") is",
      ((integer7 == integer8) and (integer9 == integer10)) )

# Print Blank Line
print()

# and | Logical AND
print("or  |  Logical OR")
print("(", integer7, " == ", integer8, ") or (", integer9, " == ", integer10, ") is",
      ((integer7 == integer8) or (integer9 == integer10)) )

# Print Blank Line
print()

# and | Logical AND
print("not  |  Logical NOT")
print("(", integer7, " == ", integer8, ") is ", (integer7 == integer8) )
print("not (", integer7, " == ", integer8, ") is ", not (integer7 == integer8) )

# Print Blank Line
print()