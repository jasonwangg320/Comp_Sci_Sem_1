import java.util.Scanner; 
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Choose a number"); 
			int num = sc.nextInt(); 
			int c = 0; 
			while (true) {
				num = num + 1; 
				System.out.println(num); 
				c ++; 
				if (c == 4)
				{ break; 
				}
			}
	}
}
