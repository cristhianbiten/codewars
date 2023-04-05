package onesAndZeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        String res = "";

        for (int i : binary)
            res += i;

        return Integer.parseInt(res, 2);

//        String[] binaryForString = new String[binary.size()];
//
//        for (int i = 0; i < binary.size(); i++) {
//            binaryForString[i] = String.valueOf(binary.get(i));
//        }
//
//        String cris = "";
//
//        for (int i = 0; i < binaryForString.length; i++) {
//            cris = cris.concat(binaryForString[i]);
//        }
//
//        return Integer.parseInt(cris, 2);

    }
}
