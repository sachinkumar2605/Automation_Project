package stringClass;

public class CharacterToString {

	public static void main(String[] args) {
		char [] ch = {'a','p','p','l','e'};
		String str = new String(ch);// using constructor og the string class
		System.out.println(ch);
		
		
		String st=String.valueOf(ch);  // using value of method
		System.out.println(st);
		
		
		String s="";
		for(int i=0;i<ch.length;i++) {
			s=s+ch[i];
		}
		System.out.println(s);
	}

}
