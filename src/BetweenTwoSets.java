import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BetweenTwoSets {
    // Write your code here
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(2);
        a.add(4);
        b.add(16);
        b.add(32);
        b.add(96);


        Set<Integer> result = new HashSet<>();
        int count = 0;

        for(Integer x : a){
            Set<Integer> tempResult = new HashSet<>();
            for(int j = 1; j <= 100; j++){
                tempResult.add(x * j);
            }
            if(count == 0){
                result = tempResult;
            }
            else {
                result.retainAll(tempResult);
            }
            count = 1;
        }

        for(Integer x : b){
            Set<Integer> tempResult = new HashSet<>();
            for(int j = 1; j <= 100; j++){
                if(x % j == 0){
                    tempResult.add(x / j);
                }
            }
            result.retainAll(tempResult);
        }

        System.out.println(result.size());
    }
}
