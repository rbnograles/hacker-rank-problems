import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {
    public static void countApplesAndOranges
            (int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int appleCount = 0;
        int orangeCount = 0;

        List<Integer> applesRanges = new ArrayList<>();
        List<Integer> orangesRanges = new ArrayList<>();

        for(int apple: apples) {
            applesRanges.add(a + apple);
        }

        for(int orange: oranges) {
            orangesRanges.add(b + orange);
        }

        for(int appleRange: applesRanges) {
            if(appleRange >= s && appleRange <= t) {
                appleCount++;
            }
        }

        for(int orangeRange: orangesRanges) {
            if(orangeRange >= s && orangeRange <= t) {
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);

    }
}
