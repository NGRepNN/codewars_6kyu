import java.util.Arrays;

public class PersistentBugger {
    public  int count;
    static String str2;
    public int recursInt(long n){
        String str=String.valueOf(n);
        char [] charArr=str.toCharArray();
        if(charArr.length<=1){
            return count;
        }
        str2=String.valueOf(charArr[0]);
        n=Long.valueOf(str2);
        for(int i=1;i<=charArr.length-1;i++){
            str=String.valueOf(charArr[i]);
            n=n* Long.valueOf(str);
        }
        count+=1;
        recursInt(n);
        return count;
    }
    public static int persistence(long n) {
      PersistentBugger persistentBugger=new PersistentBugger();
     int c= persistentBugger.recursInt(n);
    // System.out.println(c);
        return c;
    }
}
