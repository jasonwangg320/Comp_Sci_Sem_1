import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Choose a number");
		int x = sc.nextInt();
		
		System.out.println("Choose another number");
		int y = sc.nextInt(); 
		
		if (x!=y){
			System.out.println("These numbers are not equvalent");
		}
	}
}
