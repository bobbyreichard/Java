package simpleCalculator;
import java.util.Scanner;

public class simpleCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Calculator exiting. Goodbye!");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = 0.0;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
