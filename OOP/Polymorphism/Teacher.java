// Teacher.java
public class Teacher extends Person {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Teacher teaches Subject: " + subject);
    }
}
