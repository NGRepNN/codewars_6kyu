import java.util.HashMap;

//Decode the Morse code
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        String[] english = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X",
                "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ",", ".", "?" };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };
        HashMap<String,String> map=new HashMap<String, String>();
        for(int i=0;i<=english.length-1;i++){
map.put(morse[i],english[i]);
        }
    String [] code=morseCode.split(" ");
        StringBuilder result= new StringBuilder();
        for(String i:code){
            if(i.equals("")){
                result.append(" "); continue;
            }
            result.append(map.get(i));
        }
return  result.toString().replaceAll("[\\s]{2,}", " ");
    }
}
