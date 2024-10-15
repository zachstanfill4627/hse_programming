#!/usr/bin/env python3

# Object Definitions
class Student:
    def __init__ (self, firstName, lastName, age, favoriteColor):
        self.firstName = firstName
        self.lastName = lastName
        self.age = age
        self.favoriteColor = favoriteColor

    def get_fullname (self):
        return self.firstName + " " + self.lastName

    def get_favorite_color (self):
        return self.firstName + " " + self.lastName + "'s favorite color is " + self.favoriteColor

    def get_student_info(self):
        info = f"""   
        - First Name: {self.firstName}
        - Last Name: {self.lastName}
        - Age: {self.age}
        - Favorite Color: {self.favoriteColor}
        """
        return info


# Import Statements

# Introduction to Complex Data Types:
print("Complex Data Types:")

# Print Blank Line
print()

# Reviewing Character Primitive Data Type:
favoriteChar = 'b'
print("My Favorite Character is: ", favoriteChar)

# Print Blank Line
print()

# String - Words or Sentences
myWord = "Programming"
print("MyWord: ", myWord)

# Print Blank Line
print()

mySentence = "I really like developing computer programs"
print("MyString: ", mySentence)

# Print Blank Line
print()
print()

# Breaking it down:
#
# favoriteChar = 'b'
#                ^ ^ - Notice we are using single quotes
#                      In python, this doesn't really need to be
#                      Single quotes like it does in Java, because
#                      datatypes in python are dynamic as we learned
#                      in the previous lesson.
#
#                      However, to keep some form of structure between
#                      languages, we are going to use single quotes.
#
# myString = "I really like to develop computer programs"
#            ^                                          ^
#           For strings we are going to use Double Quotes
#           Again, because python has dynamic or polymorphic datatypes,
#           this isn't technically necessary, however for consistency
#           between languages, we are going to use double quotes.
#
# One thing of note, is that in more complex Python applications you will
# see a variety of quotes which each have their own purpose within the language

charList = [ 'I', ' ',
             'a', 'm', ' ', 'a', ' ',
             'l', 'i', 's', 't', ' ', 'o', 'f', ' ',
             'c', 'h', 'a', 'r', 'a', 'c', 't', 'e', 'r', 's', ' ',
             't', 'h', 'a', 't', ' ', 'm', 'a', 'k', 'e', ' ',
             'a', ' ', 'S', 't', 'r', 'i', 'n', 'g', '!'
]
for char in charList:
    print(char, end="")

# Print Blank Line
print()
print("============================")

myString = "I am A String"
print(myString)

# Print Blank Line
print()
print()

# BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK

print("Simple Objects")

# Print Blank Line
print()

# Simple Objects
print("Zachary Stanfill, is 32 years old and his favorite color is orange")

# Ahhhh, program is easy if we need something like a boolean flag, or a number, or a character
#
# What happens if we want tp have a digital representation of a student?
#
# Well students are significantly more complex than being a number or even just a string
#
# So how do we represent this? In the form of an Object
#
# Students are a Thing, which in this case means that they can be defined with a
# - First Name
# - Last Name
# - Age
# - Favorite Color

# But couldn't we just do this?
studentFirstName = "Linus"
studentLastName = "Torvald"
studentAge = 54
studentFavoriteColor = "blue"

# Yeah we absolutely could, but what happens if we need to keep track of 5 students?
#
# Keeping their individual variables would mean we have to keep track of 20 different variables
#
# Or, we could just keep track of 5 different Objects

student1 = Student("Linux", "Torvold", 54, "blue")
student2 = Student("Bill", "Gates", 70, "grey")
student3 = Student("Steve", "Jobs", 56, "purple")
student4 = Student("Jeff", "Bezos", 60, "red")
student5 = Student("Larry", "Page", 51, "green")

# Can anyone tell me who these people are?

# So storing this information is easier in the form of objects because it allows us
# to organize data.

# But wwhat else can Objects do for us?
#
# Well, we will cover reusable code in a few weeks with design of algorithms, but
# wouldn't it be really tedious to print out the favorite color of each of the students?
#
# Think:
# - print(s1_firstname, " ", s1_lastname, "\'s favorite color is ", s1_favoriteColor)
#

# Let's try some of the Student helper methods that were written:

# Let's try using the get_fullname method:
print("Student 1's first name is: ", student1.get_fullname())

# Print Blank Line
print()

# Let's try using the get_student_info method:
print("Student Info:")
print(student1.get_student_info())

# Print Blank Line
print()

# Let's try using the get_favorite_color method:
print("Favorite Color")
print(student1.get_favorite_color())

# Print Blank Line
print()

# BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK

# Activity 1: Whiteboarding a Simple Object - Subject Animal (NO CODE)

# Activity 2: Discussion of simple object helper methods (NO CODE)


# Activity 3: Assignment of String Variables


# Activity 4: Concating String Variables


# BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK

# Demonstrate out Simple Object as we Whiteboarded and Discussed in Class
# You will receive a printout of the Scratch code for this next week to keep as an example.



