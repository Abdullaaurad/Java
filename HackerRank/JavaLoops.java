import java.util.*;

class JavaLoops {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int k = a; // Initialize k with a
            for (int l = 0; l < n; l++) {
                k += b*Math.pow(2, l); // Add the result of b^l to k
                System.out.print(k + " ");
            }
            System.out.println(); // Move to the next line after printing the series
        }
        in.close();
    }
}