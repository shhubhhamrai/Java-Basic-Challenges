package Challenges;

public class Challenge03 {

    // Method to calculate max of two numbers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    public static double[] calculateArrayC(int[] a, int[] b) {
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = max(a[i], b[i]) + (double) a[i] / b[i];
        }
        return c;
    }

    public static void main(String[] args) {
        // Initialize arrays
        int[] a = {5, 7, 6, 9, 8, 1, -15, 2, 6};
        int[] b = {3, 5, 2, 8, 7, 4, -10, 1, 5};

        // Create array c
        double[] c = calculateArrayC(a, b);

        // Print array c
        System.out.print("Array c: ");
        for (double num : c) {
            System.out.print(num + " ");
        }
    }


}
