package tsar.hsb;

import java.util.Arrays;
import java.util.Comparator;

public class ProblemFour {

	public ProblemFour() {

	}

	public String findLargestNum(int[] numList) {
		String[] stringArray = new String[numList.length];
		for (int x = 0; x < numList.length; x++) {
			stringArray[x] = String.valueOf(numList[x]);
		}

		Arrays.sort(stringArray, new Comparator<String>() {
			public int compare(String x, String y) {
				return (y).compareTo(x);
			}
		});

		StringBuilder stringBuild = new StringBuilder();
		for (String s : stringArray) {
			stringBuild.append(s);
		}

		while (stringBuild.charAt(0) == '0' && stringBuild.length() > 1)
			stringBuild.deleteCharAt(0);

		return stringBuild.toString();
	}
}
