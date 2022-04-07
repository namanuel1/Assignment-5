package Assignment4;

/**
 * @author naman
 *This program calculates the Holiday Bonuses of stores that sold the most of a specific item
 */








public class HolidayBonus {

	/**
	 * @param data Array to be processed
	 * @param high Highest bonus to be given
	 * @param low Lowest bonus to be given
	 * @param other Bonus given to elemnt that is neither the highest nor lowest
	 * @return array with bonuses
	 */
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		double[] bonus = new double[data.length];

		for (int i = 0; i < data.length; i++) {

			for (int k = 0; k < data[i].length; k++) {

				if (data[i][k] > 0) {
					if (data[i][k] == TwoDimRaggedArrayUtility.getHighestInColumn(data, k))

						bonus[i] += high;

					else if (data[i][k] == TwoDimRaggedArrayUtility.getLowestInColumn(data, k))

						bonus[i] += low;
					else

						bonus[i] += other;
				}
			}

		}

		return bonus;
	}

	/**
	 * @param data Array to be processed
	 * @param high Highest bonus to be given
	 * @param low Lowest bonus to be given
	 * @param other Bonus given to elemnt that is neither the highest nor lowest
	 * @return the total number of bonuses handed out 
	 */
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		double[] bonus = new double[data.length];
		double total = 0;

		for (int i = 0; i < data.length; i++) {

			for (int k = 0; k < data[i].length; k++)

				if (data[i][k] > 0) {

					if (data[i][k] == TwoDimRaggedArrayUtility.getHighestInColumn(data, k))

						bonus[i] += high;

					else if (data[i][k] == TwoDimRaggedArrayUtility.getLowestInColumn(data, k))

						bonus[i] += low;
					else

						bonus[i] += other;
				}

		}

		for (int i = 0; i < bonus.length; i++)

			total += bonus[i];

		
		return total;
	}
}
