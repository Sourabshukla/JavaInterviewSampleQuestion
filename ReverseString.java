package InterviewPractise;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String rev="";
		System.out.println("Enter a String");
		String str=sc.nextLine();
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed String is "+rev);
		sc.close();
	}
}
