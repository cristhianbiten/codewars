package oppositeNumber;

public class Kata {
    public static int opposite(int number)
    {
        if(number >= 0) {
            return number * (-1);
        } else {
            return Math.abs(number);
        }
    }
}
