package string;

public class SubString {

	public static void main(String[] args) {
		String s="Sachinkumar K";
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 8));
		System.out.println(s.length());//including space
		String str=s.replace(" ", "");
		System.out.println(str.length());//after removing space
		}

}
