import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        char operator;
        do {
            System.out.println("""
                    +--------------------+\s
                    |     CALCULATOR     |\s
                    |--------------------|\s
                    | ADDITION       [+] |\s
                    | SUBTRACTION    [-] |\s
                    | MULTIPLICATION [*] |\s
                    | DIVISION       [/] |\s
                    | EXPONENTIATION [^] |\s
                    | FIBONACCI      [F] |\s
                    | FACTORIAL      [A] |\s
                    +--------------------+
                    """);

            operator = getInput().charAt(0);

            switch (operator) {
                case '+' -> {
                    System.out.println("Enter Augend");
                    double augend = Double.parseDouble(getInput());
                    System.out.println("Enter Addend");
                    double addend = Double.parseDouble(getInput());
                    System.out.println("Sum: " + sum(augend, addend));
                }
                case '-' -> {
                    System.out.println("Enter Minuend");
                    double minuend = Double.parseDouble(getInput());
                    System.out.println("Enter Subtrahend");
                    double subtrahend = Double.parseDouble(getInput());
                    System.out.println("Difference: " + difference(minuend, subtrahend));
                }
                case '*' -> {
                    System.out.println("Enter Multiplier");
                    double multiplier = Double.parseDouble(getInput());
                    System.out.println("Enter Multiplicand");
                    double multiplicand = Double.parseDouble(getInput());
                    System.out.println("Product: " + product(multiplier, multiplicand));
                }
                case '/' -> {
                    System.out.println("Enter Dividend");
                    double dividend = Double.parseDouble(getInput());
                    System.out.println("Enter Divisor");
                    double divisor = Double.parseDouble(getInput());
                    System.out.println("Ratio: " + ratio(dividend, divisor));
                }
                case '^' -> {
                    System.out.println("Enter Base");
                    double base = Double.parseDouble(getInput());
                    System.out.println("Enter Exponent");
                    double exponent = Double.parseDouble(getInput());
                    System.out.println("Power: " + power(base, exponent));
                }
                case 'F' -> {
                    System.out.println("Enter Index: ");
                    int index = Integer.parseInt(getInput());
                    System.out.println("Fibonacci of Index[" + index + "]: " + fibonacci(index));
                }
                case 'A' -> {
                    System.out.println("Enter Index: ");
                    int index = Integer.parseInt(getInput());
                    System.out.println("Factorial of Index[" + index + "]: " + factorial(index));
                }
                case 'Q' -> System.out.println("See you next time!");
                default -> System.out.println("Invalid Operation!");
            }
            System.out.println();
        } while (operator != 'Q');
    }

    static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static double sum(double augend, double addend) {
        return augend + addend;
    }

    static double difference(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    static double product(double multiplier, double multiplicand) {
        return multiplier * multiplicand;
    }

    static double ratio(double dividend, double divisor) {
        return dividend / divisor;
    }

    static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    static int fibonacci(int n) {
        int F_0 = 0;
        int F_1 = 1;
        for (int i = 0; i < n; i++) {
            int temp = F_0;
            F_0 = F_1;
            F_1 = temp + F_0;
        }
        return F_0;
    }

    static int slowbonacci(int n) {
        if (n < 1) {
            return 0;
        } else if (n < 3) {
            return 1;
        } else {
            return slowbonacci(n - 1) + slowbonacci(n - 2);
        }
    }

    static long factorial(int n) {
        long a = 1;
        for (int i = 2; i <= n; i++) {
            a *= i;
        }
        return a;
    }

    static int slower(int base, int exponent) {
        if (exponent < 0) {
            System.out.println("Not defined for negative Exponents.");
            return -1;
        } else if (exponent < 1) {
            return 1;
        } else if (exponent < 2) {
            return base;
        } else {
            return base * slower(base, exponent - 1);
        }
    }

    static int multiply(int x, int y) {
        if (y > x) {
            return multiply(y, x);
        } else if (y < 1) {
            return 0;
        } else if (y < 2) {
            return x;
        } else {
            return x + multiply(x, y - 1);
        }
    }
}
