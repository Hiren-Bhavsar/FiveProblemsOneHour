package tsar.hsb;

public class ProblemTwo {

	public ProblemTwo() {

	}

	public String[] returnCombined(int[] numList, String[] letterList) {
		String[] toReturn = new String[numList.length + letterList.length];

		int helper = 0;
		for (int x = numList.length >= letterList.length ? 0 : 1; x < toReturn.length; x += 2) {
			if (helper < numList.length) {
				toReturn[x] = "" + numList[helper];
				helper++;
			}
		}

		helper = 0;
		for (int x = numList.length < letterList.length ? 0 : 1; x < toReturn.length; x += 2) {
			if (helper < letterList.length) {
				toReturn[x] = letterList[helper];
				helper++;
			}
		}

		return toReturn;
	}

}
