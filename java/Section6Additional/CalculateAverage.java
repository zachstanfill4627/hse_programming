import java.util.Scanner;

public class CalculateAverage {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("How many numbers do you want to average?");
    int count = input.nextInt();

    int sum = 0;
    for (int i = 1; i <= count; i++) {
      System.out.print("Enter number " + i + ":  ");
      int number = input.nextInt();
      System.out.println();
      sum += number;
    }

    double average = (double) sum / count;

    System.out.println("The average is: " + average);
  }
}
