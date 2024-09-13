import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of 1st number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the value of the 2nd number :");
		int num2 =sc.nextInt();
		System.out.println("Enter the value of the 3rd number :");
		int num3 =sc.nextInt();
		if (num1>num2 && num1>num3 )
		{
			System.out.println(" The Largest number among all the 3 is : "+num1 );
		}
		else if (num2>num1 && num2 >num3)
		{
			System.out.println(" The Largest number among all the 3 is :" +num2);
		}
		else if(num1 == num2 && num1 == num3)
		{
			System.out.println("All 3 numbers are equal and same ");
		}
		else 
		{
			System.out.println("The largest number is "+num3);
		}
	

	}

}
