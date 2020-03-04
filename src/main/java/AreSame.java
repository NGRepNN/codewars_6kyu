import java.util.Arrays;

//Are they the "same"?
public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        boolean result;
        if (a.length == 0 || b.length == 0) {
            result = false;
        }
        else {
            int[] powArr = new int[a.length];
            int i = 0;
            Arrays.sort(a);
            Arrays.sort(b);
            for (int j : a) {
                powArr[i] = (int) (Math.pow(j, 2));
                i = i + 1;
            }
            result=Arrays.equals(powArr, b);
        }
        System.out.println(result);
        return result;
    }
}
