package tsar.hsb;

public class ProblemOne {

	public ProblemOne() {

	}

	public int sumListWhile(int[] numList) {
		int toReturn = 0;
		int x = 0;
		while (x < numList.length) {
			toReturn += numList[x];
			x++;
		}
		return toReturn;
	}

	public int sumListFor(int[] numList) {
		int toReturn = 0;

		for (int x : numList) {
			toReturn += x;
		}
		return toReturn;
	}

	public int sumListRecursion(int[] numList) {
		return sumListRecursion(numList, 0);

	}

	private int sumListRecursion(int[] numList, int x) {
		if (x < numList.length) {
			return numList[x] + sumListRecursion(numList, x + 1);
		} else {
			return 0;
		}
	}

}
