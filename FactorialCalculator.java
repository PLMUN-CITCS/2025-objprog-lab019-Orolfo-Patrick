import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Get a non-negative integer input from the user
        int number = getNonNegativeInteger();

        // Calculate the factorial
        long factorial = calculateFactorial(number);

        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Method to get a non-negative integer input from the user
    public static int getNonNegativeInteger() {
        Scanner input = new Scanner(System.in);
        int number;
        
        // Input validation loop
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number >= 0) {
                    break; // Valid input, exit loop
                } else {
                    System.out.println("Error: Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a valid integer.");
                input.next(); // Consume invalid input
            }
        }
        input.close();
        return number;
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Factorial of 0 is 1
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
