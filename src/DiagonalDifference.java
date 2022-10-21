import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        int n = arr.size();
        int sumForward = 0;
        int sumBackwards = 0;
        int totalSum = 0;

        for(int i = 0; i < n; i++) {
            sumForward += arr.get(i).get(i);
            sumBackwards += arr.get(i).get((n-1) - i);
        }

        totalSum = Math.abs(sumForward - sumBackwards);

        System.out.println(totalSum);
    }
}
