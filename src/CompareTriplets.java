import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        List<Integer> scores = new ArrayList<>();

        int bobScore = 0;
        int aliceScore = 0;


        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)){
                bobScore += 1;
            }
            else if(a.get(i) < b.get(i)) {
                aliceScore += 1;
            }
        }

        scores.add(bobScore);
        scores.add(aliceScore);

        // This problem requires you to return a List of integer
        // however to simply things we will put a print statement
        // just change the print into a return
        System.out.println(scores);
    }
}
