//Create Phone Number
public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder result= new StringBuilder("(");
        int count=0;
        for(int i:numbers){
            if(count==3){
                result.append(") ");}
            if(count==6){
                result.append("-");}
            result.append(i);
            count+=1;
        }
        return result.toString();
    }
}
