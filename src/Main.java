import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter num1: ");
        int num1 = intInput();

        System.out.println("Enter num2: ");
        double num2 = doubleInput();

        System.out.println("Enter operator: ");
        char operator = charInput();

        System.out.println("Result: " + calculate(num1, num2, operator));
    }

    static int intInput() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    static double doubleInput() {
        Scanner scanner = new Scanner(System.in);
        return Double.parseDouble(scanner.nextLine());
    }

    static char charInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().charAt(0);
    }

    static double calculate(int x, double y, char z) {
        switch (z) {
            case '+' -> {
                return x + y;
            }
            case '-' -> {
                return x - y;
            }
            case '*' -> {
                return x * y;
            }
            case '/' -> {
                return x / y;
            }
            default -> {
                System.out.println("Error!");
                return Double.NaN;
            }
        }
    }
}
