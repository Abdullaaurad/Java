public class string {
    public static void main(String[] args) {
        String string = new String("Hi How are you");
        System.out.println(string + "Abdulla");

        int length = string.length();
        System.out.println("Length of the String: " + length);

        // Substring operation
        String substring = string.substring(3, 7); // Start index: 3, End index: 7
        System.out.println("Substring: " + substring);

        // Uppercase and lowercase conversions
        String uppercase = string.toUpperCase();
        System.out.println("Uppercase: " + uppercase);

        String lowercase = string.toLowerCase();
        System.out.println("Lowercase: " + lowercase);
   
        // Checking if a string contains a substring
        boolean containsHow = string.contains("How");
        System.out.println("Contains 'How': " + containsHow);
        System.out.println("Contains 'How': " + string.indexOf("How",2));

        // Replace operation
        String replacedString = string.replace("How", "Are");
        System.out.println("Replaced String: " + replacedString);

        System.out.println("character in index 0: " + replacedString.charAt(0));
        System.out.println("character in index 1: " + replacedString.charAt(1));
        System.out.println("character in index 2: " + replacedString.charAt(2));

        System.out.println("Equal String: " + replacedString.equals("Hi Are are you"));
        System.out.println("Equal String: " + replacedString.equals("Are are you"));     //we can't use '==' it checks the two variables have the same memory locations
    }
}
 