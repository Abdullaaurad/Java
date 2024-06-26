import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        while (testCases-- > 0) {
            String line = scanner.nextLine();
            extractValidContent(line);
        }

        scanner.close();
    }

    private static void extractValidContent(String line) {
        Pattern pattern = Pattern.compile("<([^>]+)>([^<]+)</\\1>");
        Matcher matcher = pattern.matcher(line);

        boolean foundValidContent = false;
        while (matcher.find()) {
            System.out.println(matcher.group(2));
            foundValidContent = true;
        }

        if (!foundValidContent) {
            System.out.println("None");
        }
    }
}