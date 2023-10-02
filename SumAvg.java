package practise;

import java.util.Scanner;
public class SumAvg {
	static double sum(int[] a, int size) {
		double sum = 0;
		int i;
		for (i = 0; i < size; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int size, i;
		double sum = 0, avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size: ");
		size = sc.nextInt();
		int[] a = new int[size];
		System.out.print("Enter values: ");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sum = sum(a, size);
		avg = sum / size;
		System.out.println("Sum of the array: " + sum);
		System.out.println("Average of the array: " + avg);
	}
}
