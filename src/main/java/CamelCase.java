import java.lang.StringBuilder;
//Convert string to camel case
public class CamelCase {
    static String toCamelCase(String s){
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<=s.length()-1;i++){
            if((sb.charAt(0)==Character.toUpperCase(sb.charAt(0)))&&i==0){
                continue;
            }
            if(sb.charAt(i)=='-'||sb.charAt(i)=='_'){

            }
        }
        return "";
    }
}
