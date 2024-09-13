import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		String sample;
		String rev = "";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String to check if it is palindrome");
		sample=sc.nextLine();
		int length =sample.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+sample.charAt(i);
		}
		if(sample.equals(rev))
		{
			System.out.println("The Entered String is a Palindrome");
			
		}
		else
			System.out.println("The Entered String is not Palindrome");
		
	}

}
