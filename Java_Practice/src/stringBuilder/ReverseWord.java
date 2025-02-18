package stringBuilder;

public class ReverseWord {

	public static void main(String[] args) {
		String str="my name is sachin";
		StringBuilder sb = new StringBuilder();
		String[] words=str.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			sb.append(words[i]).append(" ");
		}
		System.out.println(sb);
	}

}
