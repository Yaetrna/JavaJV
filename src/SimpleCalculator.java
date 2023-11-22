import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Eingabe Integer: ");
        int x = intInput();

        System.out.println("Eingabe Double: ");
        double y = doubleInput();

        System.out.println("Eingabe Char: ");
        char c = charInput();

        System.out.println(x + " " + c + " " + y + " = " + calculate(x, y, c));
    }


    // Abfragen eines Integers
    static int intInput() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    // Abfragen eines Doubles
    static double doubleInput() {
        Scanner scanner = new Scanner(System.in);
        return Double.parseDouble(scanner.nextLine());
    }

    // Abfragen eines Chars
    static char charInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().charAt(0);
    }

    // Implementierung des Taschenrechners.
    static double calculate(int x, double y, char c) {
        switch (c) {
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
                System.out.println("No valid operator! Please use (+ OR - OR * OR /).");
                System.out.println("Returning NaN.");
                return Double.NaN;
            }
        }
    }
}
