package willYouMakeIt;

public class Kata {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        double t = distanceToPump / (mpg * fuelLeft);

        if (t <= 1) {
            return true;
        } else {
            return false;
        }

    }

}
