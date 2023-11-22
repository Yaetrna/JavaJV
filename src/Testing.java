import java.util.Random;

public class Testing {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            System.out.println(y + " * " + x + " = " + multiply(y, x) + " = " + (x * y));
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
