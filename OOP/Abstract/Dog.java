public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age); // Call the parent's constructor
    }

    @Override // Override the makeSound() method for specific behavior
    public void makeSound() {
        System.out.println("Woof!");
    }
    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog("Buddy", 3);

        // Print some information about the Dog
        System.out.println("Dog's name: " + myDog.getName());
        System.out.println("Dog's age: " + myDog.getAge());

        // Make the Dog make a sound
        myDog.makeSound();

        //Animal A =new Animal("fishy",3);       can't create a object because it's mentioned as abstract
    }
}