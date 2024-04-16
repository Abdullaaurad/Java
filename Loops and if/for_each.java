import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class for_each {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,5,3,1));
        for (int num : numbers){
            System.out.println(num);
        }
    }
}
