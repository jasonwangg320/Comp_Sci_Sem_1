import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

		Random rand = new Random(); 
		Scanner sc = new Scanner(System.in);
		int correct = rand.nextInt(1000);
		//System.out.println(correct);
	
		while (true)
		{
			System.out.println("Pick a number, any number");
				int guess = sc.nextInt(); 
			if (correct > guess) {
				System.out.println("Ur number is less than the correct number");
			}else {
				System.out.println("Ur number is greater than the correct number"); 
			}
			
			
			if(correct == guess)
			{
				break;
			}
		}
	}
}

