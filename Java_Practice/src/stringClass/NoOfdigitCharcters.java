package stringClass;

public class NoOfdigitCharcters {
public static void main(String[] args) {
	String str= "SaCHINkumar88616305@!@#17";
	
	int upperLetters=0;
	int lowerLetters=0;
	int digit=0;
	int splCharacters=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(Character.isUpperCase(ch)) {
			upperLetters++;
		}
		else if(Character.isLowerCase(ch)) {
			lowerLetters++;
		}
		else if(Character.isDigit(ch)) {
			digit++;
		}
		else {
			splCharacters++;
		}
	}
	System.out.println("The no of upperletters are " +upperLetters);
	System.out.println("The no of lowerletters are " +lowerLetters);
	System.out.println("The no of digits are "+digit);
	System.out.println("The no of spl characters are " +splCharacters);
}
}
