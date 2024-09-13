import java.util.Scanner;

public class RoomTarrif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month you want to stay ");
		int Month =sc.nextInt();
		System.out.println("Enter the room rent to calculate the tariff");
		double rent =sc.nextDouble();
		System.out.println("Enter the number of days you want to stay");
		int days =sc.nextInt();
		double incper =1.20;
		
		switch(Month)
		{
		case 1:
			rent =rent * days;
			System.out.println("your tariff is " + rent);
			break;
		case 2:
			rent =rent * days;
			System.out.println("Your tariff is " + rent);
			break;
		case 3:
			rent =rent * days;
			System.out.println("Your tariff is " + rent);
			break;
		case 4:
			rent = (rent * incper * days);
			System.out.println("Yout tariff is " + rent);
			break;
		case 5:
			rent = (rent * incper * days);
			System.out.println("Yout tariff is " + rent);
			break;
		case 6:
			rent = (rent * incper * days);
			System.out.println("Yout tariff is " + rent);
			break;
		case 7:
			rent =rent * days;
			System.out.println("Your tariff is " + rent);
			break;
		case 8:
			rent =rent * days;
			System.out.println("Your tariff is " + rent);
			break;
		case 9:
			rent =rent * days;
			System.out.println("Your tariff is " + rent);
			break;
		case 10:
			rent =rent * days;
			System.out.println("Your tariff is " + rent);
			break;
		case 11:
			rent =rent * incper * days;
			System.out.println("Your tariff is " + rent);
			break;
		case 12:
			rent =rent * incper * days;
			System.out.println("Your tariff is " + rent);
			break;
		default:
			System.out.println("Enter the number of Month between 1 to 12");
			
		
	
		
		}
		
	}

}
