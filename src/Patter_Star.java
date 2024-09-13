import java.util.Scanner;

public class Patter_Star {
	public static void main(String[] args) {

	 Scanner scanner = new Scanner(System.in);

     // Get the size of the pattern
     System.out.print("Enter the size of the pattern : ");
     int size = scanner.nextInt();

     //  Loop through each row
     for (int i = 0; i < size; i++) {
         //  Loop through each column in the row
         for (int j = 0; j < size; j++) {
             //  Print '*' on the diagonals, otherwise print ' '
             if (j == i || j == (size - i - 1)) {
                 System.out.print("*");
             } else {
                 System.out.print(" ");
             }
         }
         // Moving to the next line after printing each row
         System.out.println();
     }

     
 }
	
}

