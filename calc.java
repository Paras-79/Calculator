import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = add(num1, num2);
        System.out.println("The result of addition is: " + result);

        scanner.close();
    }

    // Method to perform addition
    public static double add(double a, double b) {
        return a + b;
    }
}