package NumericalPattern;
import java.util.Scanner;
public class Armstong {
	//count the digit
	static int CountDigit(int num) {
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		return count;	
	}
	//power finding
	static int power(int base,int expo) {
		int pow=1;
		while(expo!=0) {
			pow=pow*base;
			expo--;
		}
		return pow;
	}
	//extract and check
	static boolean checkamstrong(int num) {
		int sum=0,rem=0,temp=num;
		//count num of digits
		int len=CountDigit(num);
		while(num!=0) {
			//extract
			 rem=num%10;
		
			sum=sum+power(rem, len);
			num=num/10;
				
		}
		return temp==sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter number");
		num=sc.nextInt();
		if(num>0 && checkamstrong(num)) {
			System.out.println(num + "is an armstrong ");
		}else {
			System.out.println(num+ " is not an armstrong");
		}

	}
}
