import java.util.Arrays;

//Are they the "same"?
public class AreSame {
    public static boolean comp(int[] a, int[] b) {
int [] powArr=new int [a.length];
int i=0;
        Arrays.sort(a);
        Arrays.sort(b);
for(int j:a){
    powArr[i]=(int)(Math.pow(j,2));
    i=i+1;
        }
        return Arrays.equals(powArr,b);
    }
}
