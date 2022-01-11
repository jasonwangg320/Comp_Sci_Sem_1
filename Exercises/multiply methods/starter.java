import java.util.Scanner; 

class starter {
	public static boolean multiply(int a, int b){
		Scanner sc = new Scanner(System.in); 
		int x = a; 
		int y = b; 
		int product = x*y; 
		if (product%3 == 0) {
			System.out.println("The product is divisible by 3"); 
			return true; 
		} else {
			System.out.println("The product is not divisible by 3"); 
			return false; 
		}
		
	}	
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Choose a number"); 
			int a = sc.nextInt(); 
			sc.nextLine();
		System.out.println("Choose another number"); 
			int b = sc.nextInt(); 
			sc.nextLine(); 
		 multiply(a, b); 
	}
}
