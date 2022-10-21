import java.util.ArrayList;
import java.util.List;

public class BirthDayCakesCandles {
    public static void main(String[] args) {

        List<Integer> candles = new ArrayList<>();

        int max = 0;
        int sum = 0;
        int num;

        for(int candle: candles){
            num = candle;
            if(num > max){
                sum = 1;
                max = num;
            }else if(num == max){
                sum++;
            }
        }

        System.out.println(sum);
    }
}
