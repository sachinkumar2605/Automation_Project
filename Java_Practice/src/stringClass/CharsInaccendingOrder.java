package stringClass;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CharsInaccendingOrder {

	public static void main(String[] args) {
		String str=",@#$%^^&**4678999ksgjslfbksk";
		Set<Character> st=new TreeSet<Character>();
		for(char c:str.toCharArray()) {
		//System.out.print(c);
		st.add(c);
	}
		for(char ch: st ) {
			System.out.print(ch+" ");
		}
		
	}

}
