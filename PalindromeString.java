package InterviewPractise;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String rev="";
		System.out.println("Enter a String");
		String str=sc.nextLine();
		String temp=str;
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(temp.equals(rev)) {
			System.out.println("given string is palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		sc.close();
	}
}
