package exercise.forloop;

/**
 *@author AnhNT241
 */
public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=50000;
		double sumL2R = printLeftToRightSum(n);
		double sumR2L = printRightToLeftSum(n);
		System.out.printf("Difference: %.15f",(sumL2R - sumR2L));
		System.out.println();
	}

	private static double printRightToLeftSum(int n) {
		// TODO Auto-generated method stub
		double sum=0.0;
		for(int i=1;i<=n;i++) {
			sum+=(double) 1/i;
		}
		System.out.printf("Left-to-right harmonic sum %.15f",sum);
		System.out.println();
		
		return sum;
	}

	private static double printLeftToRightSum(int n) {
		// TODO Auto-generated method stub
		double sum=0.0;
		for(int i=n;i>=1;i--) {
			sum+=(double) 1/i;
		}
		System.out.printf("Right-to-left harmonic sum %.15f",sum);
		System.out.println();
		
		return sum;
	}

}
