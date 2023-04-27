package numberOfPeopleInTheBus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Metro {
    public static int countPassengers(ArrayList<int[]> paradas) {
        int totalDePassageiros = 0;
        for (int[] parada : paradas) {
            totalDePassageiros += parada[0] - parada[1];
        }
        return totalDePassageiros;

    }
}
