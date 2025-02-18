package string;

public class UpperandLowerCase {

	public static void main(String[] args) {
		String s="What IS your NAME";
		int str = s.trim().split(" ").length;
		System.out.println(s.substring(13,17));
		System.out.println(s.trim().split(" ").length);
		for(int i=0;i<s.length();i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				System.out.print(s.charAt(i));
			}
			//System.out.print(s.charAt(i));
		}
	}

}
