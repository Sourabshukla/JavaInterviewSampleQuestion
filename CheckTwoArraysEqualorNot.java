package InterviewPractise;
import java.util.Arrays;
import java.util.Scanner;

public class CheckTwoArraysEqualorNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Prompt the user to enter the size of the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = sc.nextInt();

        // Create the first array of the specified size
        int[] array1 = new int[size1];

        // Prompt the user to enter the elements of the first array
        System.out.print("Enter elements of the first array separated by spaces: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }
        // Prompt the user to enter the size of the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = sc.nextInt();

        // Create the second array of the specified size
        int[] array2 = new int[size2];

        // Prompt the user to enter the elements of the second array
        System.out.print("Enter elements of the second array separated by spaces: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }

        boolean status=Arrays.equals(array1,array2);
        if(status==true) {
        	System.out.println("same");
        }else {
        	System.out.println("not same");
        }
	}
}
