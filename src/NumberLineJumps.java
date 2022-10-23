public class NumberLineJumps {
    public static void main(String[] args) {
        kangaroo(2564, 5393, 5121, 2836);
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        int k1Pos = 0;
        int k2Pos = 0;
        int i = 0;

        while(i <= 10000) {

            if( i == 0) {
                k1Pos = x1 + v1;
                k2Pos = x2 + v2;
            }
            else {
                k1Pos += v1;
                k2Pos += v2;
            }

            if(k1Pos != 0 && k2Pos != 0 && (k1Pos == k2Pos))  return "YES";
            i++;
        }

        return  "NO";
    }
}
