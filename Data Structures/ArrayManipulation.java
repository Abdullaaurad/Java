import java.util.Scanner;

public class ArrayManipulation {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] enterElements(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element " + i + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void replaceElement(int[] array) {
        System.out.print("\nEnter index to replace: ");
        int k = scanner.nextInt();
        if (k < 0 || k >= array.length) {
            System.out.println("Invalid index. Please enter a valid index.");
            replaceElement(array);
        } else {
            System.out.print("Enter new value: ");
            int value = scanner.nextInt();
            array[k] = value;
        }
    }

    public static int[] removeElement(int[] Array){
        System.out.print("\nEnter index to remove: ");
        int k = scanner.nextInt();
        if (k < 0 || k >= Array.length) {
            System.out.println("Invalid index. Please enter a valid index.");
            Array = removeElement(Array);
        }
        else{
            for(int i=k;i<Array.length-1;i++){
                Array[i]=Array[i+1];
            }
            Array[Array.length-1]=0;
        }
        return Array;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = enterElements(n);
        System.out.print("Entered array: ");
        printArray(array);

        replaceElement(array);
        System.out.print("Array after replacement: ");
        printArray(array);

        removeElement(array);
        System.out.print("Array after removing element: ");
        printArray(array);

        scanner.close();
    }
}
