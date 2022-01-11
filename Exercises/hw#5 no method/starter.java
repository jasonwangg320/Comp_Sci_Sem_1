import pkg.*; 
import java.util.Scanner; 
import java.util.Random; 

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		int money = 100; 
		Scanner sc = new Scanner(System.in); 
		Random rand = new Random(); 
		while(true) {
			System.out.println("Do you wanna play the game? Type Yes or No"); 
				String play = sc.nextLine(); 
			if (play.equals("Yes") || play.equals("yes")|| play.equals("Y") || play.equals("y")) {
				System.out.println("You have " + money); 
				System.out.println("Place ur bet then");
				int bet = sc.nextInt(); 
				sc.nextLine();
				if (money - bet < 0) {
					System.out.println("You dont have enough money"); 
					break;
				} 
			
				int win1 = rand.nextInt(10) + 1; 
				int win2 = rand.nextInt(10) + 1; 
				int win3 = rand.nextInt(10) + 1; 
				System.out.println("|   " + win1 + "  |  " + win2 + "  |  " + win3 + "  |"); 
			if (win1 == win2 && win2 == win3 && win3 == win1){
				System.out.println("JACKPOT!"); 
				money = money - bet + bet*3;
				System.out.println("You have: " + money); 
			} 
			else if (win1 == win2 || win2 == win3 || win3 == win1) {
				System.out.println("You won!");
				money = money - bet + bet*2;
				System.out.println("You have: " + money); 
			} 
			else if (win1 != win2 && win2 != win3 && win3!= win1) { 
				System.out.println("You lost :("); 
				money = money - bet;
				System.out.println("You have: " + money); 	
			}
			if (money <= 0){
				System.out.println("You have no more money"); 
				break; 
			}	 
			} else if (play.equals("No") || play.equals("no") || play.equals("N") || play.equals("n")) {
			break; 
			}
	
	
	}
}
}
