import java.util.ArrayList;
import java.util.List;

public class List_2D {
    public static void main(String[] args) {
        // Creating a 2D list (list of lists) to store integers
        List<List<Integer>> matrix = new ArrayList<>();

        // Adding rows to the 2D list
        matrix.add(new ArrayList<>(List.of(1, 2, 3))); // Row 0: [1, 2, 3]
        matrix.add(new ArrayList<>(List.of(4, 5, 6))); // Row 1: [4, 5, 6]
        matrix.add(new ArrayList<>(List.of(7, 8, 9))); // Row 2: [7, 8, 9]

        // Accessing elements from the 2D list
        int elementAtRow1Column2 = matrix.get(1).get(2); // Row 1, Column 2 (value: 6)
        System.out.println("Element at Row 1, Column 2: " + elementAtRow1Column2);

        // Iterating through the 2D list
        System.out.println("2D List elements:");
        for (List<Integer> row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }

        // Modifying an element in the 2D list
        matrix.get(0).set(1, 100); // Set Row 0, Column 1 to 100
        System.out.println("2D List after modification:");
        for (List<Integer> row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
