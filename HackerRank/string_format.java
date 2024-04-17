import java.util.Scanner;

public class string_format {

    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input strings
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        // Calculate and print the sum of lengths
        int sumOfLengths = str1.length() + str2.length();
        System.out.println(sumOfLengths);

        // Check if str1 is lexicographically greater than str2
        String lexComparison = str1.compareTo(str2) > 0 ? "Yes" : "No";
        System.out.println(lexComparison);

        // Capitalize the first letters and print
        String capitalizedStr1 = capitalizeFirstLetter(str1);
        String capitalizedStr2 = capitalizeFirstLetter(str2);
        System.out.println(capitalizedStr1 + " " + capitalizedStr2);

        scanner.close();
    }
}
