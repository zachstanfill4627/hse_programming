#!/usr/bin/env python3

print("Enter three numbers ( Example: 56 32 72 )")
print("Press Enter to continue")

num1 = int(input())
num2 = int(input())
num3 = int(input())

max = num1  # Assume num1 is the largest initially

if num2 > max:
    max = num2  # Update max if num2 is larger

if num3 > max:
    max = num3  # Update max if num3 is larger

print("The largest number is: " + str(max))