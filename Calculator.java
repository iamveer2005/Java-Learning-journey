
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking two numbers as input
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        // Taking operation as input 
        System.out.println("Choose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        System.out.print("Enter your choice (1-5): ");
        int choice = sc.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("Result = " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result = " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result = " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }   break;
            case 5:
                result = a % b;
                System.out.println("Result = " + result);
                break;
            default:
                System.out.println("Invalid Choice!");
                break;
        }

        sc.close();
    }
}