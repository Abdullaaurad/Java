
public class Properties{
    public static void main(String[] args) {
        System.out.println(Integer.SIZE);
        System.out.println("Minimum value of int: " + Integer.MIN_VALUE);
        System.out.println("Maximum value of int: " + Integer.MAX_VALUE);
        System.out.println("Size of int in bits: " + Integer.SIZE);
        System.out.println("Size of int in bytes: " + Integer.BYTES);

        int intValue = Integer.parseInt("123"); // Parses a string into an int
        System.out.println("Parsed int value: " + intValue);

        String intString = Integer.toString(456); // Converts an int to a string
        System.out.println("Int value as string: " + intString);

        int compareResult = Integer.compare(100, 200); // Compares two integers
        System.out.println("Comparison result: " + compareResult);

        Double n=Double.NaN;
        System.out.println("value of Nan = "+n);
        Double k=Double.POSITIVE_INFINITY;
        System.out.println("Value of positive infinity ="+ k);
        Double l=Double.NEGATIVE_INFINITY;
        System.out.println("Value of negative infinity ="+ k);
        System.out.println(Math.sqrt(-1));
        System.out.println(Double.isNaN(Math.sqrt(-1)));
        System.out.println(Double.isFinite(3));
        System.out.println(Double.isInfinite(Math.sqrt(-1)));
        System.out.println("4 to the power 2="+Math.pow(4,2));
    }

}

// depends on the place where can be used for int,double,float,small,Big,Decimal