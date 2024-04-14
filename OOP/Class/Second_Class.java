import java.util.Scanner;

public class Second_Class {
    public String Name;
    public void derived(int x){
        System.out.println("Inside the Second class called by first class ="+x);
        System.out.println("User Name ="+Name);
    }
    public int N(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inside Second class, Enter a name =");
        Name = scanner.nextLine();
        System.out.println("User Name ="+Name);
        System.out.print("Inside Second class, Enter a number =");
        int k= scanner.nextInt();
        return k;
    }
}
