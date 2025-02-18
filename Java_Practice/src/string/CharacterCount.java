package string;

public class CharacterCount {

	public static void main(String[] args) {
		String s="bangalore is capital of karnataka";
		int count=0;
		s=s.replaceAll(" ", "");
		System.out.println(s.replaceAll(" ", "").length());
		for(int i=0;i<s.length();i++) {
			count++;
			//System.out.println(s.charAt(i));
		}
		System.out.println(count);
	}

}
