import java.util.Arrays;

public class PersistentBugger {
    public static int count;
    String str="";
    static String str2="";
    public static int persistence(long n) {
        String str=String.valueOf(n);
        char [] charArr=str.toCharArray();
        if(charArr.length<=1){
            System.out.println(count);
            return count;
        }
        str2=String.valueOf(charArr[0]);
        n=Long.valueOf(str2);
     for(int i=1;i<=charArr.length-1;i++){
        str=String.valueOf(charArr[i]);
        n=n* Long.valueOf(str);
     }
        count+=1;
     persistence(n);
        return count;
    }
}
