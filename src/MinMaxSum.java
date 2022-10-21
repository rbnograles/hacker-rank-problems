import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Collections.sort(arr);

        long min = 0;
        long max = 0;

        for(int j = 1; j < arr.size(); j++) {
            max += arr.get(j);
        }

        for(int k = 0; k < arr.size() - 1; k++) {
            min += arr.get(k);
        }

        System.out.println(min + " " + max);
    }
}
