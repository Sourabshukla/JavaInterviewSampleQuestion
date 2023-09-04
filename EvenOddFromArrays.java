package InterviewPractise;

import java.util.Scanner;

public class EvenOddFromArrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		// Create an array of the specified size
		int a[] = new int[size];

		// Prompt the user to enter the elements of the array
		System.out.print("Enter elements of the array separated by spaces: ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("even number in array is ....");
		for(int i=0;i<size;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
		System.out.println("odd number in array is ....");
		for(int i=0;i<size;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i] + " ");
			}
		}
	}
}