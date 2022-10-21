import java.util.ArrayList;
import java.util.List;

public class SimpleArraySum {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        int sum = 0;
        for(int num: ar) {
            sum += num;
        }
        System.out.println(sum);
    }
}
