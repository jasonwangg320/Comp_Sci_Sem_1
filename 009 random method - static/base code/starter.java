import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Random rand = new Random(); 
	int a = rand.nextInt(10); 
	System.out.println(a);
	
	int b = rand.nextInt(100+1);
	System.out.println(b);
	
	double c = rand.nextDouble();
	System.out.println(c+2.5);
	
	int d = rand.nextInt(574 + 15);
	double dd = rand.nextDouble();
	System.out.println(d + dd); 
	}
	
}
