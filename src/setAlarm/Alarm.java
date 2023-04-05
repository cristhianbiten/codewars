package setAlarm;

public class Alarm {

    public static boolean setAlarm(boolean employed, boolean vacation) {

        if (employed == true && vacation == true){
            return false;
        } else if (employed == false && vacation == true){
            return false;
        } else if (employed == false && vacation == false){
            return false;
        } else {
            return true;
        }

    }
}
