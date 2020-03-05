import java.util.ArrayList;
//Mexican Wave
public class MexicanWave {
    public static String[] wave(String str) {
    ArrayList<String> arrayList= new ArrayList<String>();
    String [] result;
    StringBuilder stb=new StringBuilder(str);
        for(int i=0;i<=str.length()-1;i++){
            if((stb.charAt(0)==' '||stb.charAt(str.length()-1)==' ')&&i==0){
                continue;
            }
           if(stb.charAt(i)==' '&&i>0){
               stb.setCharAt(i-1, Character.toLowerCase(stb.charAt(i-1)));
               continue;
           }
stb.setCharAt(i, Character.toUpperCase(stb.charAt(i)));
if(i>0){
    stb.setCharAt(i-1, Character.toLowerCase(stb.charAt(i-1)));
}
arrayList.add(stb.toString());
        }
        result=arrayList.toArray(new String[arrayList.size()]);
        return result;
    }
}