package integer;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 23;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println("The number is  not a prime");
			}
			
		}
		System.out.println("The number is prime");
	}

}
