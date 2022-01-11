import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
Random rand = new Random();
	int x = rand.nextInt(100);
	int y = rand.nextInt(100); 
	
	
	System.out.println(x);
	System.out.println(y);
	
	if (x != y) {
	System.out.println("These numbers are different");
	}
	}
}
