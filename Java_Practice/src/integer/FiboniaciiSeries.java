package integer;

public class FiboniaciiSeries {

	public static void main(String[] args) {
		int num=6;
		int first=0,second=1,next;
		for(int i=0;i<=num;i++) {
			System.out.print(first+" ");
			next=second+first;
			second=first;
			first=next;
		}
	}

}
