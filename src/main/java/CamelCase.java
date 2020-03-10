import java.lang.StringBuilder;
//Convert string to camel case
public class CamelCase {
    static String toCamelCase(String s){
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<=sb.length()-1;i++){
            if(sb.charAt(i)=='-'||sb.charAt(i)=='_'){
sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }
}
