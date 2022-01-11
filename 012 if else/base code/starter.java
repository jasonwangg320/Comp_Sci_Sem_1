import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);

		int random = rand.nextInt(1000);
	
	
	System.out.println("Pick a number between 1 and 1000");
		int user = sc.nextInt();
		

	if (user == random) {
		System.out.println("Congratulations, you guessed the correct number");
	
	}
	else {
		System.out.println("Lmao youre bad the number was " + random +  ", try again next time");
	}
	
	}
}