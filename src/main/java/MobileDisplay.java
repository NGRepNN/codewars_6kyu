import java.util.Arrays;

//Old Mobile Display
public class MobileDisplay {
    public static String mobileDisplay(int n, int p){
        int row=(int)((double)(n)*((double)(p)/100))-3;
        int centrRow=(int)(((double)(n)*((double)(p)/100))/2);
        int startSpase=(n-10)/2;
        int endSpace=(n-10)-startSpase;
        String space="";String rowFirs;String rowEnd;String star=""; String result=""; String MenuContactsSpace=""; String CodeWarsStartSpace="";String CodeWarsEndSpace="";
        for(int i=1;i<=n;i++){
            if(startSpase>=i){CodeWarsStartSpace=CodeWarsStartSpace+" ";}
            if(endSpace>=i){CodeWarsEndSpace=CodeWarsEndSpace+" ";}
            if(i>=3) {
                if(i>16){MenuContactsSpace=MenuContactsSpace+" ";}
                space = space + " ";
            }
            star=star+"*";
        }
        rowFirs=star+"\n*";
        rowEnd="*\n"+star;
        for(int i=0;i<=row+1;i++){
if(i==0){result=rowFirs;continue;}
if(i==centrRow-1){result=result+CodeWarsStartSpace+"CodeWars"+CodeWarsEndSpace+"*\n*";continue;}
if(i==row+1){
    result=result+" Menu"+MenuContactsSpace+"Contacts ";
    result=result+rowEnd;break;
}
result=result+space+"*\n*";
        }
        return result;
    }
}
