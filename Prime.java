package InterviewPractise;

import java.util.Scanner;

public class Prime {
	static boolean Isprime(int n){
		if(n==1) {
			return false;
		}
		int c=2;
		while(c*c<=n) {
			if(n%c==0) {
				return false;
			}c++;
	}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(Isprime(n)) {
			System.out.println(n+ " is prime number");
		}else {
			System.out.println(n+" is not a prime number");
		}
	}
}
