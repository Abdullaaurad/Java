public class food {

    private String name;
    private int age;

    public food(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Generic animal sound!");
    }

    public abstract String getName();

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        
    }
}