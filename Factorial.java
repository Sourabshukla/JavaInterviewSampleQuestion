package InterviewPractise;

import java.util.Scanner;

public class Factorial {
	static int fact(int n) {
		int fact=1;
		while(n!=1) {
			fact=fact*n;
			n--;
		}return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		fact(n);
		System.out.println("Factorial of given number is "+ fact(n));

		
		
	}
	
}
