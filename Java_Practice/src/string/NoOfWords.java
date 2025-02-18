package string;

public class NoOfWords {

	public static void main(String[] args) {
		String str="My name is sachin";
		String[] words = str.trim().split(" ");
		System.out.println(str.split("\\s").length);
		System.out.println(words.length);
	}

}
