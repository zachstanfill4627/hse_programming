package com.hse.programming;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.rmi.UnexpectedException;
import java.util.Scanner;

public class MazeSolver {

  private static char[][] maze;
  private static int startX, startY;
  private static int endX, endY;
  private static int currentX, currentY; // Track current position

  public static void main(String[] args) throws UnexpectedException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter maze filename (without .txt): ");
    String filename = scanner.nextLine();

    loadMaze(filename);
    // Clear the console before printing the initial maze
    clearConsole();
    printMaze();

    int loopiteration = 0;

    currentX = startX;
    currentY = startY;

    while (currentX != endX || currentY != endY) {
      loopiteration++;

      // Ask user where to move
      System.out.println("Enter move (w/a/s/d): ");
      char move = ' ';

      try {   // Exception Catching Logic
        move = scanner.nextLine().charAt(0);   // Read User Input
      } catch (Exception e) {
        System.out.println("Invalid Move Entry, Try again.");   // Simple Print Error
        continue;  // Go back to "while" on line 33
      }

      int newX = currentX;
      int newY = currentY;

      // Moving the Character
      if (move == 'w') {
        newY--;
      } else if (move == 'a') {
        newX = newX - 3;
      } else if (move == 's') {
        newY++;
      } else if (move == 'd') {
        newX = newX + 3;
      } else {
        System.out.println("Invalid move.");
        continue; // Go back to "while" on line 33
      }

      try {   // Exception Catching Logic
        while (maze[newY][newX] == '#') { // Go to nearest point to the wall
          if (move == 'w') {
            newY++;
          } else if (move == 'a') {
            newX++;
          } else if (move == 's') {
            newY--;
          } else if (move == 'd') {
            newX--;
          } else {
            throw new UnexpectedException("Error with movement");
          }
        }

        // Adjust position to stay within bounds
        newX = Math.max(0, Math.min(newX, maze[0].length - 2));
        newY = Math.max(0, Math.min(newY, maze.length - 2));

        clearConsole();
        maze[currentY][currentX] = ' ';
        currentX = newX;
        currentY = newY;
        maze[currentY][currentX] = 't';
      } catch (ArrayIndexOutOfBoundsException e) {
        newX = Math.max(0, Math.min(newX, maze[0].length - 2));
        newY = Math.max(0, Math.min(newY, maze.length - 2));
      }

      printMaze();
    }

    System.out.println("Congratulations! You solved the maze in " + loopiteration + " loop iterations.");
    scanner.close();
  }

  private static void loadMaze(String filename) {
    try {
      // Get the resource URL directly
      URL resourceUrl = MazeSolver.class.getResource("/mazes/" + filename + ".txt");

      if (resourceUrl == null) {
        System.out.println("Maze file not found: /mazes/" + filename + ".txt");
        System.exit(1);
      }

      // Open the InputStream from the URL
      try (InputStream inputStream = resourceUrl.openStream();
           Scanner fileScanner = new Scanner(inputStream)) {

        int rows = fileScanner.nextInt();
        int cols = fileScanner.nextInt();
        fileScanner.nextLine(); // Consume newline

        maze = new char[rows][cols];
        int lineCount = 0; // Add a line counter for debugging
        for (int i = 0; i < rows; i++) {
          String line = fileScanner.nextLine();
          lineCount++; // Increment the line counter

          // Check if the line is shorter than the expected number of columns
          if (line.length() < cols) {
            System.out.println("Error: Line " + lineCount + " is too short.");
            System.exit(1);
          }

          for (int j = 0; j < cols; j++) {
            maze[i][j] = line.charAt(j);
            if (maze[i][j] == 'S') {
              startX = j;
              startY = i;
            } else if (maze[i][j] == 'E') {
              endX = j;
              endY = i;
            }
          }
        }

        System.out.println("Lines read: " + lineCount); // Print the line count

      } catch (IOException e) {
        System.out.println("Error reading maze file: " + e.getMessage());
        System.exit(1);
      }

    } catch (NullPointerException e) {
      System.out.println("Maze file not found.");
      System.exit(1);
    }
  }

  private static void printMaze() {
    for (int i = 0; i < maze.length; i++) {
      for (int j = 0; j < maze[i].length; j++) {
        System.out.print(maze[i][j]);
      }
      System.out.println();
    }
  }

  // Method to clear the console
  public static void clearConsole() {
    try {
      if (System.getProperty("os.name").contains("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

      } else {
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
    } catch (IOException | InterruptedException e) {
      System.out.println("Error clearing console: " + e.getMessage());
    }
  }
}