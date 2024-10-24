#!/usr/bin/env python3

# Scanner input = new Scanner(System.in);  # Not needed in Python

print("How many numbers do you want to average?")
count = int(input())

sum = 0
for i in range(1, count + 1):  # Python uses range() for loops
    print("Enter number " + str(i) + ":  ")
    number = int(input())
    print()
    sum += number

average = sum / count  # No need for explicit casting in Python

print("The average is: " + str(average))