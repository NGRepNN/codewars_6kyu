//Bit Counting
public class BitCounting {
    public static int countBits(int n){
        // Show me the code!
       int result=Integer.toBinaryString(n).replace("0","").length();
        return result;
    }
}
