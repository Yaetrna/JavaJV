package calculators;

import java.util.Scanner;

public class ExamFriendlyCalculator {
    public static void main(String[] args) {
        int n1;
        double n2;
        char c;
        double res;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die erste Zahl ein: ");
        n1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Geben Sie die zweite Zahl ein: ");
        n2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Geben Sie den Operator ein: ");
        c = scanner.nextLine().charAt(0);

        switch (c) {
            case '+':
                System.out.println("+");
                res = add(n1, n2);
                System.out.println("Ergebnis: " + res);
                break;
            case '-':
                System.out.println("-");
                res = sub(n1, n2);
                System.out.println("Ergebnis: " + res);
                break;
            case '*':
                System.out.println("*");
                res = mul(n1, n2);
                System.out.println("Ergebnis: " + res);
                break;
            case '/':
                System.out.println("/");
                res = div(n1, n2);
                System.out.println("Ergebnis: " + res);
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }

    static double add(int x, double y) {
        return x + y;
    }

    static double sub(int x, double y) {
        return x - y;
    }

    static double mul(int x, double y) {
        return x * y;
    }

    static double div(int x, double y) {
        return x / y;
    }
}
