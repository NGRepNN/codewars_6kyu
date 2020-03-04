import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Playing with digits
public class PlayingDigits {
    public static long digPow(int n, int p) {
        long sum=0;
        int cloneN=n;
        int result=-1;
        int pow=p;
        List<Integer> nums = new ArrayList<>();
        while (cloneN != 0) {
            nums.add(cloneN % 10);
            cloneN /= 10;
        }
        Collections.reverse(nums);
        for(int i:nums){
            sum=sum+(long)(Math.pow(i,pow));
            pow+=1;
        }
        result=(int)(sum/n);
     if(result<=0){result=-1;}
        return result;
    }
}
