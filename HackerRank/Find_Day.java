import java.io.*;
import java.util.*;

class Result {

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String dayName = days[dayOfWeek - 1];
        return dayName;
    }

}

public class Find_Day{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the month (1-12): ");
        int month = Integer.parseInt(bufferedReader.readLine());

        System.out.print("Enter the day of the month: ");
        int day = Integer.parseInt(bufferedReader.readLine());

        System.out.print("Enter the year: ");
        int year = Integer.parseInt(bufferedReader.readLine());

        String res = Result.findDay(month, day, year);

        System.out.println("Day of the week: " + res);

        bufferedReader.close();
    }
}
