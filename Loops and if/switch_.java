import java.util.Scanner;

public class switch_ {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day of week =");
        int k= scanner.nextInt();
        String dayName;
        switch (k) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("day = "+dayName);
    }
}
