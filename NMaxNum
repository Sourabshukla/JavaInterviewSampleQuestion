package practise;
import java.util.Scanner;
public class NMaxNum {
	static int[] sort(int[] a, int size) {
		int i, j;
		int n = size - 1;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int size, i, pos;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		size = sc.nextInt();
		int[] a = new int[size];
		System.out.print("Enter array values: ");
		for (i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the position: ");
		pos = sc.nextInt();
		if (pos <= 0 || pos >= size) {
			System.out.println("Invalid input!!!");
		} else {
			a = sort(a, size);
			for (i = 0; i < size; i++) {
				System.out.print(a[i] + " ");
			}
			int val = a[size - pos];
			System.out.println("\nThe maximimun element: " + val);
		}
	}
}
