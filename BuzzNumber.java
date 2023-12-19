//those numbers that are divisible by seven or end with seven. For example, 57 is a buzz number because the number ends with seven.
//Another example is 28 because the number is divisible by seven.

package NumericalPattern;
import java.util.Scanner;
public class BuzzNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number "); 
		int n=sc.nextInt();
		if(n==7 || n%7==0) {
			System.out.println(n+" is buzz number");
		}else {
			System.out.println(n+" is not a buzz number ");
		}
		sc.close();
		
		
	}
}
