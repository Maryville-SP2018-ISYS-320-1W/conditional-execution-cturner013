import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

/*  EXAMPLE
-- Your conditional expression
x < y

-- Your test values for x, y, z and do you expect true or false?
1, 2, 0 -> TRUE
2, 1, 0 -> FALSE
*/

/* 1. 
-- Your conditional expression
y>0

-- Your test values for x, y, z and do you expect true or false?
0,1,0->T
0,-3,0->F
*/

/* 2. 
-- Your conditional expression
x!=0

-- Your test values for x, y, z and do you expect true or false?
1,0,0->T
0,0,0->F
*/

/* 3.  
-- Your conditional expression


-- Your test values for x, y, z and do you expect true or false?

*/

/* 4.  
-- Your conditional expression
y>=z+x

-- Your test values for x, y, z and do you expect true or false?
4,2,2->T
3,5,7->F
*/

public class P1_YourOwnWords {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println( 4 + " " + 2 + " " + 2 );
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		// Replace the conditional test, x < y below with your conditional expression to verify it is correct
		// using your test values
		if( x < y ) {
			System.out.println("The test was TRUE");
		} else {
			System.out.println("The test was FALSE");
		}

	}

}
