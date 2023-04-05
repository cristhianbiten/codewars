package squareSum;

public class Kata {

    public static int squareSum(int[] n) {
        int x = 2;
        int y = 0;

        for(int i = 0; i < n.length; i++) {
            y += Math.pow(n[i], x);
        }

        return y;
    }
}
