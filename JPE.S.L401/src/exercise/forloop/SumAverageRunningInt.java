package exercise.forloop;

/**
 *@author AnhNT241
 */
public class SumAverageRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Define variables
		int sum=0; //The accumulated sum, init to 0
		double average; //average in double
		int lowerBound =1;
		int upperBound =100;
		
		//Use a for-loop to sum from lowerbound to upperbound
		for(int number = lowerBound; number<= upperBound; ++number) {
			sum+=number;
		}
		average = sum/upperBound;
		
		System.out.println("Average of all 100 first numbers: "+ average);
	}

}
