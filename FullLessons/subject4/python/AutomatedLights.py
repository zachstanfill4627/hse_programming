#!/usr/bin/env python3

# Initialize or Declare variables
hour = 0
lightStatus = False
isOccupied = False

print("Should we turn the lights off?")

# Begin Asking Questions:
hour = int(input("(Integer) What time of day is it? (In Hours - 0-24)  "))

# Conditional - Hour Validation
if hour < 0 or hour > 24:
  print("Invalid Hour Input - Hours Input accepts 0-24")
  exit(1)

# Conditional to set isNightTime - Remember we only want
# lighting automation between certain hours of the day
isNightTime = (hour >= 0 and hour <= 7) or (hour >= 17 and hour <= 24)

lightStatus = input("(Boolean) Are the Lights Currently On? (true / false)  ").lower() == "true"

isOccupied = input("(Boolean) Is the room currently Occupied? (true / false)  ").lower() == "true"

# Print Blank Line
print()

# Conditional IF room is unoccupied
if lightStatus and not isOccupied:
  print("The lights are on and the room is unoccupied, we should turn the lights off")
else:
  if isNightTime and not lightStatus and isOccupied:
    print("We can turn the lights on because its night time and the room is occupied")
  else:
    print("We should leave the lights the way they are")