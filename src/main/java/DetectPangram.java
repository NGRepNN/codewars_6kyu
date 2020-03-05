import java.util.ArrayList;
import java.util.stream.Collectors;

//Detect Pangram
public class DetectPangram {
    public boolean check(String sentence){
        String abc="[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]";
        boolean resultBool;
        String result=sentence.replace(" ","");
        result=result.toLowerCase();
        char [] c=result.toCharArray();
        ArrayList<String> arr=new ArrayList<>();
        for(char i : c){
           arr.add(String.valueOf(i));
        }
        resultBool=abc.equals(arr.stream().distinct().sorted().filter((n)->!n.equals(".")&&!n.equals(",")).collect(Collectors.toList()).toString());
        return resultBool;
    }
}
