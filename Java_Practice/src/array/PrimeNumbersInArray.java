package array;

public class PrimeNumbersInArray {

	public static void main(String[] args) {
		int nums[]= {2,3,4,5,6,8,8,9,0};
		for(int num:nums) {
			for(int i=2;i<=num/2;i++) {
				if(num/i==0) {
				System.out.print(num);	
				}
				System.out.print(num);
			}
			//System.out.print(num);
			
		}
	}

}
