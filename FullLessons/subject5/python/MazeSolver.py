#!/usr/bin/env python3
import os
import platform
import time


def load_maze(filename):
    """
    Loads a maze from a text file in the resources directory.

    Args:
        filename (str): The name of the maze file (without .txt).

    Returns:
        tuple: A tuple containing the maze (list of lists), start coordinates (x, y), and end coordinates (x, y).
    """
    try:
        with open(f"resources/mazes/{filename}.txt", "r") as f:
            rows, cols = map(int, f.readline().split())
            maze = [list(f.readline().strip()) for _ in range(rows)]
            start_x, start_y = None, None
            end_x, end_y = None, None
            for i in range(rows):
                for j in range(cols):
                    if maze[i][j] == "S":
                        start_x, start_y = j, i
                    elif maze[i][j] == "E":
                        end_x, end_y = j, i
            return maze, start_x, start_y, end_x, end_y
    except FileNotFoundError:
        print(f"Maze file not found: resources/{filename}.txt")
        exit(1)


def print_maze(maze):
    """Prints the maze to the console."""
    for row in maze:
        print("".join(row))


def clear_console():
    """Clears the console."""
    if platform.system() == "Windows":
        os.system("cls")
    else:
        os.system("clear")


# --- Main program ---

# Load the maze
filename = input("Enter maze filename (without .txt): ")
# filename = "Maze1"  # For testing with a specific maze file
maze, start_x, start_y, end_x, end_y = load_maze(filename)

# Initialize current position
current_x, current_y = start_x, start_y

# Clear the console and print the initial maze
clear_console()
print_maze(maze)

loop_iteration = 0

# Main loop
while current_x != end_x or current_y != end_y:
    loop_iteration += 1

    # Get user input for the move
    move = input("Enter move (w/a/s/d): ").lower()

    new_x, new_y = current_x, current_y

    # Update position based on the move
    if move == "w":
        new_y -= 1
    elif move == "a":
        new_x -= 3  # Adjusted for horizontal movement
    elif move == "s":
        new_y += 1
    elif move == "d":
        new_x += 3  # Adjusted for horizontal movement
    else:
        print("Invalid move.")
        continue

    try:
        # Move to the nearest point to the wall
        while maze[new_y][new_x] == "#":
            if move == "w":
                new_y += 1
            elif move == "a":
                new_x += 1
            elif move == "s":
                new_y -= 1
            elif move == "d":
                new_x -= 1
            else:
                raise ValueError("Error with movement")

        # Keep the position within the maze boundaries
        new_x = max(0, min(new_x, len(maze[0]) - 2))
        new_y = max(0, min(new_y, len(maze) - 2))

        # Update the maze and current position
        clear_console()
        maze[current_y][current_x] = " "
        current_x, current_y = new_x, new_y
        maze[current_y][current_x] = "t"

    except IndexError:
        # Handle the case where the new position is out of bounds
        new_x = max(0, min(new_x, len(maze[0]) - 2))
        new_y = max(0, min(new_y, len(maze) - 2))

    # Print the updated maze
    print_maze(maze)
    time.sleep(0.2)  # Add a small delay for better visualization

print(f"Congratulations! You solved the maze in {loop_iteration} loop iterations.")