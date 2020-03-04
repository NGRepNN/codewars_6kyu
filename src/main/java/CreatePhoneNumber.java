//Create Phone Number
public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String result="(";
        int count=0;
        for(int i:numbers){
            if(count==3){result=result+") ";}
            if(count==6){result=result+"-";}
            result=result+i;
            count+=1;
        }
        return  result;
    }
}
