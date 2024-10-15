package com.hse.programming;

import java.util.List;

public class ServiceApplication3 {

    public static void main(String[] args) {

        // Introduction to Complex Data Types:
        System.out.println("Complex Data Types:");

        // Print Blank Line
        System.out.println();

        // Reviewing the Character Primitive Data Type:
        char favoriteChar = 'b';
        System.out.println("My Favorite Character is: " + favoriteChar);

        // Print Blank Line
        System.out.println();

        // String - Words or Sentences
        String myWord = "Programming";
        System.out.println("MyWord: " + myWord);

        // Print Blank Line
        System.out.println();

        String mySentence = "I really like developing computer programs";
        System.out.println("MyString: " + mySentence);

        // Print Blank Line
        System.out.println();
        System.out.println();

        /**
         * Breaking it down:
         *
         * char favoriteChar = 'b';
         *                     ^ ^  - Notice, for characters we use single quotes
         *                            This is because it is a LITERAL, meaning we want
         *                            Literally just the character
         *
         * String myString = "I really like developing computer programs";
         *                  ^                                          ^
         *                  Firstly we see that with strings, we are using double quotes
         *
         *
         * String myString = "I really like developing computer programs";
         * ^ - The next thing that we notice is that the type declaration is capitalized
         *
         *     That is because, although we can see Strings as a Word, or grouping of characters
         *     the computer is actually looking at this as an Object which we cover later in this
         *     lesson, but in general will only be working with simple examples in this class.
         *
         * In other words, Strings can be thought of as an ordered list of characters
         *
         * This is the first complex data type we will be working with today.
         */

        List<Character> charList = List.of('I', ' ',
                                                     'a', 'm', ' ', 'a', ' ',
                                                     'l', 'i', 's', 't', ' ', 'o', 'f', ' ',
                                                     'c', 'h', 'a', 'r', 'a', 'c', 't', 'e', 'r', 's', ' ',
                                                     't', 'h', 'a', 't', ' ', 'm', 'a', 'k', 'e', ' ',
                                                     'a', ' ', 'S', 't', 'r', 'i', 'n', 'g', '!');
        for (char letter : charList) {
            System.out.print(letter);
        }

        // Print Blank Line
        System.out.println();
        System.out.println("============================");

        // A String is just a List or Characters
        String myString = "I am a String";
        System.out.println(myString);

        // Print Blank Line
        System.out.println();
        System.out.println();

        // BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK

        System.out.println("Simple Objects:");

        // Print Blank Line
        System.out.println();

        // Simple Objects
        System.out.println("Zachary Stanfill, is 32 years old and his favorite color is orange");

        /**
         * Ahhhh, programming is easy if we need something like a boolean flag, or a number, or a character
         *
         * What happens if we want to have a digital representation of a student.
         *
         * Well students are significantly more complex than being a number, or even just a string
         *
         * So how do we represent this? In the form of an Object
         *
         * Students are a Thing, which in this case mean that they can be defined with a
         * - First Name
         * - Last Name
         * - Age
         * - Favorite Color
         *
         */

        // But couldn't we just do this?
        String studentFirstName = "Linus";
        String studentLastName = "Torvald";
        int studentAge = 54;
        String studentFavoriteColor = "blue";

        /**
         * Yeah we absolutely could, but what happens if we need to keep track of 5 students?
         *
         * Keeping their individual variables would mean we have to keep track of 20 different
         * variables
         *
         * Or, we could just keep track of 5 different Objects
         */

        Student student1 = new Student("Linus", "Torvald", 54, "blue");
        Student student2 = new Student("Bill", "Gates", 70, "grey");
        Student student3 = new Student("Steve", "Jobs", 56, "purple");
        Student student4 = new Student("Jeff", "Bezos", 60, "red");
        Student student5 = new Student("Larry", "Page", 51, "green");

        // Can anyone tell me who these people are?

        /**
         * So storing this information is easier in the form of objects because it allows us
         * to organize data.
         */

        /**
         * But what else can Objects do for us?
         *
         * Well, we will cover reusable code in a few weeks with the design of algorithms, but
         * wouldn't it be really tedious to print out the favorite color of each of the students?
         *
         * Think:
         * - System.out.println(s1_firstname + " " + s1_lastname +
         *                            "'s favorite color is " + s1_favoriteColor);
         *
         * Instead, we would use the printFavoriteColor() method for the Student Object
         * - System.out.println(student1.printFavoriteColor());
         *
         * See how our code is more efficiently written?
         */

        // Let's try some of the Student helper methods that were written:

        // Let's try using the printFullName method:
        System.out.println("Student 1's full name is: " + student1.getFullName());

        // Print Blank Line
        System.out.println();

        // Let's try using the printStudentInfo method:
        System.out.println("Student Info:");
        System.out.println(student1.printStudentInfo());

        // Print Blank Line
        System.out.println();

        // Let's try using the printFavoriteColor method:
        System.out.println("Favorite Color:");
        System.out.println(student1.printFavoriteColor());

        // Print Blank Line
        System.out.println();

        // BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK

        // Activity 1: Whiteboarding a simple Object - Subject Animal (NO CODE)

        // Activity 2: Discussion of simple objects helper methods (NO CODE)


        // Activity 3: Assignment of String Variables



        // Activity 4: Concating String Variables


        // BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK BREAK

        // Demonstrate our Simple Object we Whiteboarded and Discussed in class
        // You will receive a printout of the Scratch code for this next week to keep as an example.

    }
}
