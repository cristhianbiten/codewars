package convertNumberArray;

public class convert {

	public static void main(String[] args) {

		long g = 35231;

		String[] nums = new StringBuilder(String.valueOf(g)).reverse().toString().split("");
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			result[i] = Integer.parseInt(nums[i]);
		}

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
