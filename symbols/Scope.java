public class Scope {
    private int k=0;
    public static void main(String[] args) {
        int k=1;
        System.out.println("the value of k ="+k);
        Scope l = new Scope();
        System.out.println("the value of k ="+l.k);
    }
}

// can't use scope resolution operator or anything
