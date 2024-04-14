import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        int[] Array1 = new int[5]; 
        
        int[] Array2 = { 1, 2, 3, 4, 5 };

        int[] Array3;
        Array3 = new int[]{ 1, 2, 3, 4, 5 };
        System.out.println(Array3.length);

        int[] sourceArray = { 1, 2, 3 };
        int[] targetArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);

        int max = Arrays.stream(Array2).max().getAsInt();
        int min = Arrays.stream(Array2).min().getAsInt();
        System.out.println("max in Array1 ="+max);
        System.out.println("min in Array1 ="+min);

        System.out.println("Index of value ="+Arrays.binarySearch(Array2,2));

        for (int number : Array2) {
            System.out.println(number);
        }

        int[] numbers = { 5, 2, 9, 1, 7 };
        Arrays.sort(numbers);
        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num+", ");
        }
        System.out.println("\n"+Arrays.toString(numbers));              //don't work for 2D Arrays

        int[][] Array4 = {{9,4,7},{4,3,1,4,2,5,3}};
        System.out.println("\n"+Arrays.deepToString(Array4));

        String[] filledArray3 = new String[Array3.length];
        Arrays.fill(filledArray3, "");
        System.out.println(Arrays.toString(filledArray3));

        Integer[] Array5= new Integer[5];
        List<Integer> test = Arrays.asList(Array5);  
        List<String> k = Arrays.asList(filledArray3);
    }
}
