import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MigratoryBirds {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);

        HashMap<Integer, Integer> birdTypes = new HashMap<>();

        int counter = 0;
        int numberType = Integer.MIN_VALUE;

        for(int t : arr) {
           if(birdTypes.containsKey(t)) {
               // add one to the type count
               birdTypes.put(t, birdTypes.get(t) + 1);
           } else  {
               // place 1 count on the type
               birdTypes.put(t, 1);
           }
        }
        // loop for each keys on the hashmap
        for(int i: birdTypes.keySet()) {
            if(birdTypes.get(i) > counter) {
                numberType = i;
                counter = birdTypes.get(i);
            }
        }

        System.out.println(numberType);
    }
}
