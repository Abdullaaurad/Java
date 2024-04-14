public class First_Class {
    public static void main(String[] args) {
        System.out.println("The main function inside the First class");
        Second_Class k= new Second_Class();
        k.Name="Abdulla";
        k.derived(5);
        int l= k.N();
        System.out.println("Inside Main The number = "+l);
    }
}
