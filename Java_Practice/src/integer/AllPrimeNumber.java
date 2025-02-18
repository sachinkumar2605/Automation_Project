package integer;

public class AllPrimeNumber {

	public static void main(String[] args) {
		int num = 18;
		for(int i=2;i<=num;i++) {
			//System.out.println("i "+i);
			boolean isPrime=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i+" is prime");
			}
		}
	}

}
