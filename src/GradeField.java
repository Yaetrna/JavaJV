import java.util.Arrays;
import java.util.Scanner;

public class GradeField {
    /*
    A program to calculate the average of a class test.
    After entering the number of grades, the individual grades are entered.
    The average is then calculated automatically.
    All grades are displayed on the screen again for checking purposes.
     */
    public static void main(String[] args) {
        System.out.println("Enter number of grades: ");
        double[] arr = new double[intInput()];

        System.out.println("Enter the grades: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Grade [" + (i + 1) + "]: ");
            arr[i] = doubleInput();
        }

        System.out.println("Unsorted: \n" + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted: \n" + Arrays.toString(arr));

        System.out.println("Minimum: " + arr[0]);
        System.out.println("Maximum: " + arr[arr.length - 1]);
        System.out.println("Median: " + median(arr));
        System.out.println("Average: " + (calculateAverage(arr)));
    }

    static int intInput() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    static double doubleInput() {
        Scanner scanner = new Scanner(System.in);
        return Double.parseDouble(scanner.nextLine());
    }

    static double calculateAverage(double[] arr) {
        double sum = 0;
        for (double x : arr) {
            sum += x;
        }
        return sum / arr.length;
    }

    static double betterAverage(double[] arr) {
        return Arrays.stream(arr).sum() / arr.length;
    }

    static void quickSort(double[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    static int partition(double[] arr, int begin, int end) {
        double pivot = arr[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                double swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        double swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;
        return i + 1;
    }

    static double median(double[] arr) {
        int middle = arr.length / 2;
        if (arr.length % 2 == 1) {
            // Assuming x = arr.length = 9. then x % 2 returns 1 if x is odd.
            // arr.length / 2 = 4.5 to int, which is 4. And the 4th index is exactly the middle.
            return arr[middle];
        }
        return (arr[middle] + arr[middle + 1]) / 2;
    }
}
