import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        double positive = 0;
        double negative = 0;
        double zero = 0;
        double n = arr.size();

        for(int num: arr) {
            if(num > 0) {
                positive++;
            }
            else if(num < 0) {
                negative++;
            }
            else {
                zero++;
            }
        }

        double pRatio = positive / arr.size();
        double nRatio = negative / arr.size();
        double zRatio = zero / arr.size();

        System.out.println(pRatio);
        System.out.println(nRatio);
        System.out.println(zRatio);
    }
}
