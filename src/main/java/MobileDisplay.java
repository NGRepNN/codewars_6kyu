import java.util.Arrays;

//Old Mobile Display
public class MobileDisplay {
    public static String mobileDisplay(int n, int p){
        int row=(int)((double)(n)*((double)(p)/100))-3;
        String space="";String rowFirs;String rowEnd;String star=""; String result="";
        for(int i=1;i<=n;i++){
            if(i>=3) {
                space = space + " ";
            }
            star=star+"*";
        }
        rowFirs=star+"\n*";
        rowEnd="*\n"+star;
        for(int i=0;i<=row+1;i++){
if(i==0){result=rowFirs;continue;}
if(i==row+1){result=result+space+rowEnd;break;}
result=result+space+"*\n*";
        }
        System.out.println(result);
        return "";
    }
}
