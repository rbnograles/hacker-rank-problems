public class Staircase {
    public static void main(String[] args) {
        int n = 5;
        String space = " ";
        char symbol = '#';

        for(int i = 0; i < n; i++) {
            for(int j = i; j < (n-1); j++) {
                System.out.print(space);
            }
            for(int k = 0; k < (i+1); k++) {
                System.out.print(symbol);
            }
            System.out.print("\n");
        }
    }
}
