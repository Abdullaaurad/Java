import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class list {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Adding elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);

        // Accessing elements from the list
        System.out.println("First element: " + numbers.get(0)); // Output: 10
        System.out.println("Second element: " + numbers.get(1)); // Output: 20
        numbers.set(1,30);

        // Iterating through the list
        System.out.println("List elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Checking if an element exists in the list
        int searchElement = 20;
        if (numbers.contains(searchElement)) {
            System.out.println(searchElement + " is present in the list.");
        } else {
            System.out.println(searchElement + " is not present in the list.");
        }

        // Removing an element from the list
        numbers.remove(1); // Remove the second element (index 1)
        System.out.println("List after removing the second element:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Getting the size of the list
        System.out.println("Size of the list: " + numbers.size());

        List<Integer> list = new ArrayList<>(Arrays.asList(100, 60, 30, 70, 40, 120));
        System.out.println("List initialized with starting elements: " + list);

        Collections.sort(list);
        System.out.println("Sorted element: " + list);

        Collections.reverse(list);
        System.out.println("sorted in descending format: " + list);
    }
}
