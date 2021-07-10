import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		
		double a ;
		
		double b ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Devidened");
		
	    a = sc.nextDouble();
	      
	    System.out.println("enter a Devisor");
	     
	    b = sc.nextDouble();
	      
	    System.out.println("The quotient will be :: " + a/b );
	     
	    System.out.println("The remainder will be :: " + a%b );
	     
	}

}
