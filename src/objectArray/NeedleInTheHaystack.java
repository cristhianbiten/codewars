package objectArray;

import java.util.Arrays;

public class NeedleInTheHaystack {

	public static String findNeedle(Object[] haystack) {
		return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");

	}
}
