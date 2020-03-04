import java.util.ArrayList;
//Your order, please
public class Order {
    public static String order(String words) {
        String result;
        String [] strArr=words.split(" ");
        ArrayList<String>arrayList=new ArrayList<String>();
        for(int i=0;i<=strArr.length-1;i++){
            for(int j=0;j<=strArr.length-1;j++){
                if(strArr[j].contains(String.valueOf(i + 1))){
                    arrayList.add(strArr[j]);
                }
            }
        }
result=String.join(" ",arrayList);
       return  result;
    }
}
