
public class SwapNum {
public static void main(String[] args) {
		
		int a = 10 , b = 15 ;
		
		System.out.println("Before swapping " );
		System.out.println("a = " + a +  "  b = " +b );
		// calculation
		b = a * b ; // 10*15=150
		a = b / a ; // 150/10=15
		b = b / a ; // 150/15=10
		
		System.out.println("After swapping " );
		System.out.println("a = " + a +  "  b = " +b );
		
		
    }

}
