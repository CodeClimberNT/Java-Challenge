//If you wanna download this file remember to rename the file as the class name

/* Kata Sum of the first nth term of Series 7 kyu
	Description:
	Your task is to write a function which returns the sum of following series upto nth term(parameter).
	Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +... */

public class NthSeries {
	public static String seriesSum(int n) {
		double sum = 1;
		double den = 1;
		for(double i = 1; i <= n; i++){
			sum += 1/(den+3);
			den +=3;
		}
		return String.valueOf(sum);
	}
}
