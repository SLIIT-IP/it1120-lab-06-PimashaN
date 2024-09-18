import java.util.Scanner;

public class IT24102459Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfSquares = 0;
        int count = 0;
        int number;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println("Please enter a positive number.");
                continue;
            }

            sumOfSquares += number * number;
            count++;
        }

        if (count == 0) {
            System.out.println("No valid numbers were entered.");
        } else {
            double rms = Math.sqrt((double) sumOfSquares / count);
            System.out.printf("\nThe Root Mean Square (RMS) is: %.2f%n", rms);
        }
    }
}
