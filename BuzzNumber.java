package NumericalPattern;

import java.util.Scanner;

public class BuzzNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number "); 
		int n=sc.nextInt();
		if(n==7 || n%7==0) {
			System.out.println(n+" is buzz number");
		}else {
			System.out.println(n+" is not a buzz number ");
		}
		sc.close();
		
		
	}
}
