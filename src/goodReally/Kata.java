package goodReally;

public class Kata {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int total = 0;

        for (int array : classPoints) {
            total += array;
        }

        return (total / classPoints.length) <= yourPoints ? true : false;
    }
}

