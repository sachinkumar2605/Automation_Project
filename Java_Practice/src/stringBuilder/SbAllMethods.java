package stringBuilder;

public class SbAllMethods {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.append(" World"));
		System.out.println(sb.insert(5, " java"));
		System.out.println(sb.replace(5, 12, " Sachin  "));
		System.out.println(sb.capacity());
		System.out.println(sb.delete(0, 4));
		System.out.println(sb.reverse());
		
		String str = "hello";
		System.out.println(str.concat("world"));
		
	}

}
