package exercise.ifelse;

import java.util.Scanner;

/**
 *@author AnhNT241
 */
public class CheckPassFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter value for number: ");
		int mark=scanner.nextInt();
		
		System.out.println("The mark is "+mark);
		
		//if-else statement
		if(mark>=50)
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		System.out.println("--------------");
		System.out.println("CHECK DONE");
	}

}
