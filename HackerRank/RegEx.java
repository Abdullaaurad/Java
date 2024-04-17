import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // Completed the second compile argument

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1)); // Replaced the regex to replace and the replacement
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
