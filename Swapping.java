package InterviewPractise;

import java.util.Scanner;

public class Swapping {
	static void swap(int a, int b) {
		
		//logic 1
		System.out.println("before Swapping number is "+ a + " " +b);
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping number is " +"a="+ a +" b="+ b);
		System.out.println(" ");
		System.out.println("logic 2");
		//logic 2
		a=a+b;  //a=10 b=20   a=a+b=30
		b=a-b;// b=30-20=10
		a=a-b; // a=30-10=20
		System.out.println("After Swapping number is " +"a="+ b +" b="+ a);
		
		
		//logic 3
		System.out.println(" ");
		System.out.println("logic 3");
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swapping number is " +"a="+ a +" b="+ b);


	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Enter a number");
		int b=sc.nextInt();
		
		swap(a, b);
		sc.close();
	}
}	
