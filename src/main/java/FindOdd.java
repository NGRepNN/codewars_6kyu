import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] a) {
        HashMap<Integer, Integer> hashMap= new HashMap<Integer, Integer>();
        int count=0;
        for (int i = 0, j = a.length; i < j; i++) {
            if (!hashMap.containsKey(a[i])) {
                hashMap.put(a[i], 1);
            }
            else {
                hashMap.put(a[i], hashMap.get(a[i]) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> i :hashMap.entrySet()){
            if(i.getValue()%2==1){count=i.getKey();}
        }
        return count;
    }
}
