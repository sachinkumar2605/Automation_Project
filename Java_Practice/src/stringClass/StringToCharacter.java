package stringClass;

public class StringToCharacter {
	public static void main(String[] args) {
		String st="shella";
		char [] ch = st.toCharArray();  // using the tochararray method
		System.out.println(ch);
		System.out.println(ch[2]);
		
		
		String s="APPLE";
		System.out.println(s.charAt(0));
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}
	}

}
