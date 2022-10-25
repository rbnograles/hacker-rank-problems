import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecord {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();

        scores.add(0);
        scores.add(9);
        scores.add(3);
        scores.add(10);
        scores.add(2);
        scores.add(20);

        int highScoreCount = 0;
        int lowScoreScount = 0;
        int max = 0;
        int min = 0;
        int i = 0;

        List<Integer> tt = new ArrayList<>();

        for(int score: scores) {
            if(i != 0) {
                if(score > max) {
                    max = score;
                    highScoreCount++;
                }
                if(score < min) {
                    min = score;
                    lowScoreScount++;
                }
            }
            else {
                max = score;
                min = score;
            }
            i++;
        }

        tt.add(highScoreCount);
        tt.add(lowScoreScount);

        System.out.println(tt);
    }
}
