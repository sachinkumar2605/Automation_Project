package stringBuilder;

public class p1 {

	public static void main(String[] args) {
		String str="sachinkumar";
		StringBuilder sb=new StringBuilder();
		str=str.replaceAll("a", "@");
		System.out.println(str);
		for(int i=0;i<str.length();i++) {
			sb=sb.append(str.charAt(i));
			
			if (i == 9) {
                sb.append('@');
			}
		}
		System.out.println(sb);
		
	}

}
