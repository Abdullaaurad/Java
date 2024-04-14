import java.util.Arrays;

public class for_loop {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println("for loop " + i + " Iteration");
        }

        int[] numbers = { 10, 2, 6, 11, 9, 4 };
        for (int number : numbers) {
            System.out.println(number); // Prints each element of the array
        }
    }
}
  