import java.util.Scanner;

public class Lexiographical {

    public static String getSmallestAndLargest(String s, int k) {
        int n = s.length();
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= n - k; i++) {
            String str = s.substring(i, i + k);
            int result1 = smallest.compareTo(str);
            int result2 = largest.compareTo(str);

            if (result1 > 0) {
                smallest = str;
            }

            if (result2 < 0) {
                largest = str;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}