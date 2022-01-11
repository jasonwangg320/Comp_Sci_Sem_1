import java.util.Scanner; 
import java.util.Random; 

class starter {
	
	public static Random rand = new Random(); 
	public static Scanner sc = new Scanner(System.in); 
	public static int money = 100; 
		
	//	public static void roulette() {
		//	while(true) { 
			//	System.out.println("Do you wanna play roulette"); 
			//		String play = sc.nextLine(); 
		//		if (play.equals("Yes") || play.equals("yes") || play.equals("Y") || play.equals("y")){
			//		System.out.println("You have " + money); 
			//		System.out.println("The rates: "); 
			//		System.out.println("- Red or Black = 2 to 1"); 
			//		System.out.println("-Odd or Even = 2 to 1"); 
			//		System.out.println("-High (19-36) or Low (1-18) = 2 to 1"); 
			//		Systeem.out.println("-Specific Number = 10 to 1"); 
			//		System.out.println("______________________________________"); 
			//		System.out.println("How much do you wanna bet"); 
			//			int bet = sc.nextInt(); 
		//				sc.nextLine(); 
		//			if (money - bet < 0) { 
		//				System.out.println("You dont have enough money loser"); 
		//				return; 
		//			}
		//		int odd = rand.nextInt(2); 
		//		if (odd = 0) { 
					
				
		//	}		
			
	//	}
		
		public static void guess() { 
		Scanner sc = new Scanner(System.in); 
		Random rand = new Random(); 
		
		while(true) {
			System.out.println("Do you wanna play guess the number? Type yes or no"); 
				String play = sc.nextLine(); 
			if (play.equals("Yes") || play.equals("yes") || play.equals("Y") || play.equals("y")){
				System.out.println("You have " + money); 
				System.out.println("How much do you wanna bet. The rates are 5 to 1."); 
					int bet = sc.nextInt();
					String a = sc.nextLine(); 
				if (money - bet < 0) {
					System.out.println("You dont have enough money biatch"); 
					return; 
				}
					
				int ran = rand.nextInt(100) + 1; 
				System.out.println("Guess a number between 1-100"); 
					int user = sc.nextInt(); 
					String b = sc.nextLine(); 
				if (ran == user) {
					System.out.println("You win, Congrats"); 
					money = money + bet*5; 
					System.out.println(money); 
				} else {
					System.out.println("Stop losing"); 
					money = money - bet; 
					System.out.println(money); 
				}
		} else {
			return; 
		}
		}
		}
		public static void blackjack() { 
			Scanner sc = new Scanner(System.in); 
			Random rand = new Random(); 
			while(true) { 
				int player = 0; 
				int computer = 0; 
				System.out.println("Do you wanna play blackjack? Type Yes or No"); 
					String play = sc.nextLine(); 
				if (play.equals("Yes") || play.equals("yes") || play.equals("Y") || play.equals("y")) {
					System.out.println("You have " + money);
					System.out.println("Your total: " + player);
					System.out.println("Place ur bet"); 
						int bet = sc.nextInt(); 
							String a = sc.nextLine(); 
				if (money - bet < 0) {
					System.out.println("You dont have enough money"); 
					return; 
				}
				player = rand.nextInt(11) + 2; 
				computer = rand.nextInt(11) +1; 
					while(player < 21 && computer < 21) { 
						System.out.println("Press h to hit");
						System.out.println("Press s to stand"); 
						System.out.println("Do you wanna hit or stand"); 
						String choice = sc.nextLine(); 
						if (choice.equals("H") || choice.equals("h")) {
							int hit = rand.nextInt(11) + 1; 
							player = player + hit;
							int add = rand.nextInt(11)+1; 
							computer = computer + add; 
							
						if (player < 21){
							System.out.println("Points: " + player); 
						} else { 
							System.out.println("Imagine busting fucking loser"); 
							money = money - bet; 
							System.out.println("Your money: " + money); 
							return; 
							} 
						}
						if (choice.equals("s") || choice.equals("S")){ 
							System.out.println("Your Points: " + player); 
							break; 
						} 
			}
				
				System.out.println("Computer total: " + computer); 
	
				if (player > computer) { 
					System.out.println("Congrats you won addict"); 
					money = money + bet; 
					System.out.println("Your money: " + money); 
				} else if (computer > player) {
					System.out.println("You lost loser"); 
					money = money - bet; 
					System.out.println("Your money: " + money); 
				} else if (player == computer) { 
					System.out.print("You tied"); 
					money = money; 
					System.out.println(money); 
				}
			
		} else {
			return; 
		}

		}			
	}

	public static void slots() {
		Scanner sc = new Scanner(System.in); 
		Random rand = new Random(); 
		while(true) {
			System.out.println("Do you wanna play slots? Type Yes or No"); 
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
				return; 
			}	 
			} else if (play.equals("No") || play.equals("no") || play.equals("N") || play.equals("n")) {
			return; 
			}
	
	
	}
}
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in); 
		Random rand = new Random(); 
		while (true) { 
		System.out.println("What game do you wanna play: ");  
		System.out.println("1. Blackjack"); 
		System.out.println("2. Slots"); 
		System.out.println("3. Guess"); 
			int game = sc.nextInt();
			String b = sc.nextLine(); 
		if (game == 1 || b.equals("Blackjack") || b.equals("blackjack")) { 
			blackjack(); 	
		} else if (game == 2 || b.equals("Slots") || b.equals("slots")) {
			slots(); 
		} else if (game == 3 || b.equals("Guess") || b.equals("guess")) { 
			guess(); 
		}
		}
	}
		}
	
