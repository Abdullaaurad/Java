package function;
public class calling_another_function_from_another_class {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        var x=new Classinanotherfile();
        x.print();
    }
}         

// in java typically files are set to its class name only one class can be in one file
// we can access across multiple files to run the main function with different classes in different files
