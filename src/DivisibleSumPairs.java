import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        int n = 0;
        int k = 0;
        List<Integer> ar = new ArrayList<>();

        int counter = 0;

        for(int i = 0; i < ar.size() - 1; i++) {
            for(int j = i + 1; j < ar.size(); j++) {
                int total = ar.get(i) + ar.get(j);
                if (total % k == 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
