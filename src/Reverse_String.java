import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		String originalStr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to be reversed:");
		originalStr =sc.nextLine();
		String reversedStr = "";

		for (int j = 0; j < originalStr.length(); j++) {
		  reversedStr = originalStr.charAt(j) + reversedStr;
		}

		System.out.println("Reversed string: "+ reversedStr);
	}

}
