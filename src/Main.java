import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        // Task 1
        int[] dataPoints = new int[100];

        // Task 2
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 3
        System.out.println("DataPoints:");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Task 4
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the values in dataPoints is: " + sum);
        System.out.println("The average of the values in dataPoints is: " + average);

        // Task 5
        System.out.print("Enter a number between 1 and 100: ");
        int userVal = in.nextInt();

        // Task 6
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userVal) {
                count++;
            }
        }
        System.out.println("The value " + userVal + " was found " + count + " times in the array.");

        // Task 7
        System.out.print("Enter another number between 1 and 100: ");
        int searchVal = in.nextInt();

        boolean found = false;
        int position = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchVal) {
                found = true;
                position = i;
                break;
            }
        }

        if (found) {
            System.out.println("The value " + searchVal + " was found at array index " + position + ".");
        } else {
            System.out.println("The value " + searchVal + " was not found in the array.");
        }

        // Task 8
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        // Task 9
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

        in.close();
    }

    public static double getAverage(int values[]) {
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return (double) sum / values.length;
    }
}