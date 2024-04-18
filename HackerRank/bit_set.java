import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bit_set {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Initialize two BitSets with size n
        BitSet bitset1 = new BitSet(n);
        BitSet bitset2 = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String operation = scanner.next();
            int operand1 = scanner.nextInt();
            int operand2 = scanner.nextInt();

            switch (operation) {
                case "AND":
                    if (operand1 == 1) {
                        bitset1.and(bitset2);
                    } else {
                        bitset2.and(bitset1);
                    }
                    break;
                case "OR":
                    if (operand1 == 1) {
                        bitset1.or(bitset2);
                    } else {
                        bitset2.or(bitset1);
                    }
                    break;
                case "XOR":
                    if (operand1 == 1) {
                        bitset1.xor(bitset2);
                    } else {
                        bitset2.xor(bitset1);
                    }
                    break;
                case "FLIP":
                    if (operand1 == 1) {
                        bitset1.flip(operand2);
                    } else {
                        bitset2.flip(operand2);
                    }
                    break;
                case "SET":
                    if (operand1 == 1) {
                        bitset1.set(operand2);
                    } else {
                        bitset2.set(operand2);
                    }
                    break;
            }

            // Print the number of set bits in both BitSets
            System.out.println(bitset1.cardinality() + " " + bitset2.cardinality());
        }

        scanner.close();
    }
}
