import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Geben Sie die Zahl ein, für die Sie die Fibonacci-Folge berechnen möchten: ");
        int userInput = userIntInput();

        printFibonacciSequence(userInput);
    }

    static int userIntInput() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    static int recursiveFibonacci(int n) {
        if (n < 1) {
            return 0;
        } else if (n < 3) {
            return 1;
        } else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
    }

    static void printFibonacciSequence(int n) {
        System.out.println("Die Fibonacci-Folge für n = " + n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(recursiveFibonacci(i) + ", ");
        }
        System.out.print(recursiveFibonacci(n));
    }
}
