import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        int d = 4;
        int m = 1;

        int ways = 0;
        int sum = 0;

        for(int i = 0; i < s.size(); i++) {
            for(int j = 0; j < m; j++) {
                if((i + j) < s.size()){
                    System.out.println(s.get(i+j));
                    sum += s.get(i + j);
                }
            }

            if(sum == d) {
                ways++;
            }
            sum = 0;
        }

        System.out.println(ways);
    }
}



