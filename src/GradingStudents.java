import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();

        int multiple = 5;
        int nextMultiple = 0;
        int minimumScoreForRounding = 38;
        List<Integer> adjustedGrades = new ArrayList<>();

        for(int grade : grades) {
            if(grade >= minimumScoreForRounding) {
                // get the remainder of the grade
                int remainder = grade % multiple;

                if(remainder > 5) multiple = 10;

                nextMultiple = (grade - remainder) + multiple;
                int diff = nextMultiple - grade;

                    if(diff < 3) {
                        adjustedGrades.add(nextMultiple);
                    } else {
                        adjustedGrades.add(grade);
                    }
            }
            else {
                adjustedGrades.add(grade);
            }
        }
    }
}
