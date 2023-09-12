package NumericalPattern;

import java.util.Scanner;

public class ProductTable {
	static int prod(int n) {
		int i,prod;
		for( i=1;i<=10;i++) {
			prod=n*i;
			System.out.println(n+ " x "+i +" = "+prod );
		}
		return n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an number");
		int n=sc.nextInt();
		prod(n);
		sc.close();
	}
}
