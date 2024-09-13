import java.util.Scanner;

public class Grade_for_students {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter average of your marks ");
	      int marks = sc.nextInt();
	      char grade;

	      if(marks == 100){
	         System.out.println("Your grade is S");;
	      }
	      else if (marks >=90 && marks <=99)
	      {
	    	System.out.println("Your grade is A");
	      }
	      else if(marks>=80 && marks <=89){
	         System.out.println("Your grade is B");
	      }
	      else if(marks>=70 && marks<=79){
	    	  System.out.println("Your grade is C");
	      }
	      else if (marks >=60 && marks <=69) {
	    	  System.out.println("Your grade is D");
	      }
	      else if(marks >=50 && marks <=59) {
	    	  System.out.println("Your grade is E");
	      }
	      else {
	    	  grade ='F';
	      }
	      if (marks >100)
	      {
	    	  System.out.println("Please enter the marks below 100, Invalid Input");
	      }

	     
	}

}
