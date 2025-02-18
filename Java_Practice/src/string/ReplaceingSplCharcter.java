package string;

public class ReplaceingSplCharcter {

	public static void main(String[] args) {
		String input = "sachinkumar";
        StringBuilder output = new StringBuilder();
        input=input.replaceAll("a", "@");
        // Loop through the input string and apply the transformation
        for (int i = 0; i < input.length(); i++) {
           //input=input.replaceAll("a", "@");
            output.append(input.charAt(i));
            if (i == 9) {
                output.append("@"); // Add '@' after the 8th character
            }
        }
        
        // Print the transformed output
        System.out.println(output.toString());
        System.out.println(output);
	}

}
