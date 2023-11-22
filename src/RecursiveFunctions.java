public class RecursiveFunctions {
    public static void main(String[] args) {
    }

    // Very good solution for fibonacci. (If in doubt, add some checks for n < 0 but the function is undefined for n < 0).
    static int fibonacci(int n) {
        if (n < 1) {
            return 0;
        } else if (n < 3) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Very good recursive solution (If in doubt, add some checks for n < 0 but the n! is undefined for n < 0).
    static long factorial(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Probably good enough (If in doubt, add some checks for base, exponent < 0).
    static int power(int base, int exponent) {
        if (exponent < 1) {
            return 1;
        } else if (exponent < 2) {
            return base;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    // Geht safe besser aber ich hab kein bock herauszufinden wie.
    static int multiplication(int x, int y) {
        if (y > x) {
            return multiplication(y, x);
        } else if (x < 1) {
            return 0;
        } else if (y < 2) {
            return x;
        } else {
            return x + multiplication(x, y - 1);
        }
    }
}
