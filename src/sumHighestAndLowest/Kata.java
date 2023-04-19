package sumHighestAndLowest;

import java.util.*;

public class Kata {

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return 0;
        }

        int minimo = Arrays.stream(numbers).min().getAsInt();
        int maximo = Arrays.stream(numbers).max().getAsInt();
        int soma = Arrays.stream(numbers).sum();

        return soma - minimo - maximo;

    }
}
