import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int random = rand.nextInt(1000);
		
		System.out.println("Pick a number any number"); 
		int user = sc.nextInt();
		
		if (random == user) {
			System.out.println("Congrats ur not bad");
			
		} else if (random > user) {
			System.out.println("Ur number is less than the actual nmumber");
			
		}	else if (random < user) {
			System.out.println("Ur number is greater than the actual number");
		}
		
		
		
	}
}
