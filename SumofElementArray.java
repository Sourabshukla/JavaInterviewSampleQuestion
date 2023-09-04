package InterviewPractise;

import java.util.Scanner;

public class SumofElementArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		// Create an array of the specified size
		int a[] = new int[size];

		// Prompt the user to enter the elements of the array
		System.out.print("Enter elements of the array separated by spaces: ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			sum=sum+a[i];
		}
		
		System.out.println("sum of array element: "+sum);
		sc.close();
	}
}
