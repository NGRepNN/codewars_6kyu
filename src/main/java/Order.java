import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

//Your order, please
public class Order {
    public static String order(String words) {
        String [] strArr=words.split(" ");

        int i =strArr[0].indexOf("5");
        System.out.println(i);
        String result;
        System.out.println(Arrays.stream(strArr).sorted().collect(Collectors.toList()));
       return  null;
    }
}
