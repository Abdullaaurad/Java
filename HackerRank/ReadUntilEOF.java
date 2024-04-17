import java.util.*;

public class ReadUntilEOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 0;
        String[] array = new String[100];

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.trim().isEmpty()){
                break;
            }
            array[lineNumber] = line;
            lineNumber++;
        }

        for (int i = 0; i < lineNumber; i++) {
            System.out.println((i + 1) + " " + array[i]);
        }

        scanner.close();
    }
}