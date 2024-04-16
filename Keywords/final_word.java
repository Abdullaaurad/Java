public class final_word {

    public final void cantoverride(){
        System.out.println("Can't overload this function in any derived classes ");
    }
    public static void main(String[] args) {
        final_word k =new final_word();
        k.cantoverride();
    }
}

// can use final keyword to classes too so the other classes can not create derived class from it