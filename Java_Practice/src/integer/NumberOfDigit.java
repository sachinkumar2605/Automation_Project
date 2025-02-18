package integer;

import java.util.Scanner;

public class NumberOfDigit {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the numbers");
	   int num=sc.nextInt();
		int a=0;
		if(num<0) {
			num=num*-1;
		}
		else if(num==0){
			num=1;
		}
		while(num>0) {
			num=num/10;
			a++;
		}
		System.out.println("the total numbers are "+  a);
	}

}
