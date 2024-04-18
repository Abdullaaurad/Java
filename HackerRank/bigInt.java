import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bigInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger k = scanner.nextBigInteger();
        BigInteger l = scanner.nextBigInteger();
        BigInteger m = l.add(k);
        BigInteger n = l.multiply(k);
        System.out.println(m);
        System.out.println(n);
    }
}