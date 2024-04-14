public class Methods {
    public static void main(String[] args){
        int x=20;
        int y=10;
        System.out.println(Integer.max(x,y));
        System.out.println(Integer.compare(x,y));

        String Money= "200";
        System.out.println(Integer.valueOf(Money));         //Integer
        System.out.println(Integer.parseInt(Money));        //int
        System.out.println(Float.valueOf(Money));         
        System.out.println(Float.parseFloat(Money));
        System.out.println(Double.valueOf(Money));         
        System.out.println(Double.parseDouble(Money));
    }
}
