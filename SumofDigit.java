package InterviewPractise;

import java.util.Scanner;

public class SumofDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a Number");
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			sum=sum+num%10;
			//sum=sum+num;
			num=num/10;
		}
		System.out.println("The sum of given number is : "+sum);
		
		sc.close();
	}
}
