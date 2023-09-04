package InterviewPractise;

import java.util.Scanner;

public class MaxMinEleArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array number");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=1;i<size;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("the maximum number is "+max);
		int min=a[0];
		for(int i=1;i<size;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("the minimum number is "+min);
		
	}
}
