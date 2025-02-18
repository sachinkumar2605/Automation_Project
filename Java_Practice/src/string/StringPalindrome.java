package string;

public class StringPalindrome {

	public static void main(String[] args) {
		String s=new String("SAas");
		String rev="";
		System.out.println(s.toUpperCase());//all the charcter are uppercase
		System.out.println(s.toCharArray());
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			System.out.println(rev);
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("The string is palindrome  "+ rev);
		}
	}

}
