package calculators;

import java.util.Scanner;

public class BestCalculator {
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        int numOne = Integer.parseInt(getInput());
        System.out.println("Enter a Double: ");
        double numTwo = Double.parseDouble(getInput());
        System.out.println("Enter a Char: ");
        char operator = getInput().charAt(0);

        System.out.println("Result: " + calculate(numOne, numTwo, operator));
    }

    static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static double calculate(int x, double y, char z) {
        return switch (z) {
            case '+' -> x + y;
            case '-' -> x - y;
            case '*' -> x * y;
            case '/' -> x / y;
            default -> Double.NaN;
        };
    }
}
