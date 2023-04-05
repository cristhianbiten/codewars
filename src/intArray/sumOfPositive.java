package intArray;

public class sumOfPositive {
	public static int sum(int[] arr) {
		int soma = 0;
		for (Integer x : arr) {
			if (x >= 0)
				soma += x;
		}
		return soma;
	}
}
