package tsar.hsb;

public class ProblemThree {

	public ProblemThree() {

	}

	public double[] firstHundredFib() {
		double[] toReturn = new double[100];
		toReturn[0] = 0;
		toReturn[1] = 1;

		for (int x = 2; x < toReturn.length; x++) {
			toReturn[x] = toReturn[x - 1] + toReturn[x - 2];
		}

		return toReturn;
	}
}
