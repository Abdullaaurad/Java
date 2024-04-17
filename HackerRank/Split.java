import java.io.*;
import java.util.*;

public class Split {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] words = s.split("\\s+|\\p{Punct}");
        int n=0;
        for( String word : words){
            if(!word.isEmpty()){
               n=n+1;
            }
        }
        System.out.println(n);
        for( String word : words){
            if(!word.isEmpty()){
               System.out.println(word); 
            }
        }
        scan.close();
    }
}