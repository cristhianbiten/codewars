package DigitDigit;

public class SquareDigit {
    public int squareDigits(int n) {
        String strNum = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        for (char c : strNum.toCharArray()) {
            int digit = Character.getNumericValue(c);
            sb.append(digit * digit);
        }
        return Integer.parseInt(sb.toString());
    }
}
