package testing123;

import java.util.List;
import java.util.ArrayList;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        List<String> linhasNumeradas = new ArrayList<String>();
        int numeroDaLinha = 1;
        for (String line : lines) {
            linhasNumeradas.add(numeroDaLinha + ": " + line);
            numeroDaLinha++;
        }
        return linhasNumeradas;
    }
}
