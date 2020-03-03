import java.util.stream.IntStream;

public class Multiples {
    public static int solution(int number) {
  int sum = IntStream.range(0,number).filter((n)->n%3==0||n%5==0).sum();
        return sum;
    }
}
