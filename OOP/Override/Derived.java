public class Derived extends Base {                                     //! Have to use extends keyword to specify the Base and derived class relationships
    @Override
    public void describe() {
        System.out.println("This is a car.");
    }

    public static void main(String[] args) {
        Base vehicle = new Base();
        Derived car = new Derived();

        // Calling the describe method of the Vehicle class
        vehicle.describe(); // Output: This is a generic vehicle.

        // Calling the describe method of the Car class (overridden version)
        car.describe(); // Output: This is a car.
    }
}
