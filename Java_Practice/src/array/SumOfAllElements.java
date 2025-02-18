package array;

import java.util.Scanner;

public class SumOfAllElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the element");
		int []a=new int[sc.nextInt()];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();	
		}
		System.out.println(a);
		int sum =0;
		for(int j=0;j<a.length;j++) {
			sum+=a[j];
			System.out.println(a[j]);
		}
		System.out.println(sum);
	}

}
