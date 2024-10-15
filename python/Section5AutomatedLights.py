#!/usr/bin/env python3

import time

"""
This script simulates an automated lighting system.

Variables:
hour              - 00-24 hours time of day (24 resets to 00)
light_status   - True/False - Are the lights on?
is_occupied    - True/False - Is the room occupied?

Conditions for Lighting Automation
Turn Lights Off:
1. If the room is unoccupied, the lights should be off.

Turn Lights On:
1. Time of day must be between:
    a. 0 - 7     (12 AM - 7 AM)
    b. 17 - 24   (5 PM - 12 AM)
2. The room is occupied.

Under all other circumstances, the lights should be turned off.
"""

# Initialize variables
hour = 0
light_status = False
is_occupied = False

print("Should we turn the lights off?")

# Main loop to continuously check conditions
while True:
    try:
        # Get user input for the current hour
        hour = int(input("(Integer) What time of day is it? (In Hours - 0-24)  "))

        # Validate hour input
        if hour < 0 or hour > 24:
            print("Invalid Hour Input - Hours Input accepts 0-24")
            exit(1)  # Exit the program if the input is invalid

        # Determine if it's nighttime
        is_nighttime = (hour >= 0 and hour <= 7) or (hour >= 17 and hour <= 24)

        # Get user input for light status and room occupancy
        light_status = input("(Boolean) Are the Lights Currently On? (true/false)  ").lower() == "true"
        is_occupied = input("(Boolean) Is the room currently Occupied? (true/false)  ").lower() == "true"

        # Print a blank line for readability
        print()

        # Check conditions and print the appropriate action
        if light_status and not is_occupied:
            print("The lights are on and the room is unoccupied, we should turn the lights off")
        else:
            if is_nighttime and not light_status and is_occupied:
                print("We can turn the lights on because it's nighttime and the room is occupied")
            else:
                print("We should leave the lights the way they are")

        # Wait for 10 seconds
        time.sleep(10)

        # Print blank lines for separation
        print("\n===============================\n")

    except ValueError:
        print("Invalid input. Please enter an integer for the hour and 'true' or 'false' for the other questions.")