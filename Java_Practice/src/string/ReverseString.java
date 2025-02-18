package string;

public class ReverseString {

	public static void main(String[] args) {
		String s = "SACHINKUMAR";
		String str="ncjdsglk";
		for(int j=str.length()-1;j>=0;j--) {
			System.out.print(str.charAt(j));
		}
		int count=0;
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			count++;
			rev=rev+s.charAt(i);
			System.out.println(rev);
		}
		System.out.println(count);
		System.out.println(rev);
	}

}
