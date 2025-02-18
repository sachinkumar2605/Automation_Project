package stringBuilder;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str="my name is sachin";
		String[] words=str.split(" ");
		String revStr="";
		for(int i=0;i<words.length;i++) {
			System.out.print(words[i]+" ");
			String word=words[i];
			char ch;
			String st="";
			for(int j=0;j<word.length();j++) {
				ch=word.charAt(j);
				st=ch+st;
			}
			revStr=revStr+st+" ";
			
		}
		System.out.println(revStr);
	}

}
