package reversedSequence;

public class Sequence {

    public static int[] reverse(int n){
        int[] array = new int[n];
        int[] array2 = new int[n];
        int tamanhoVetorOriginalZeroBased = array.length - 1;

        if (n > 0) {
            for(int i = 0; i < n; i++) {
                array[i] = i + 1;
            }
        }

        for(int i = 0; i < array.length; i++) {
            array2[i] = array[tamanhoVetorOriginalZeroBased - i];
        }

        return array2;
    }

}
