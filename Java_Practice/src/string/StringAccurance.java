package string;

import java.util.HashMap;

public class StringAccurance {

	public static void main(String[] args) {
		String str ="Sachinkumar345678897765443";
		System.out.println(str.toCharArray());
		HashMap<Character,Integer> charcount=new HashMap<Character,Integer>();
		for(char ch:str.toCharArray()) {
			if(Character.isLetterOrDigit(ch)) {
				charcount.put(ch, charcount.getOrDefault(ch, 0)+1);
			}
		}
		System.out.println(charcount);
	}

}
