import java.util.Scanner; 
import java.util.Random; 

class starter {
	public static Scanner sc = new Scanner (System.in); 
	public static int c; 
	
	public static boolean checkPrime(int y){ 
		int x = y; 
		c = x - 1; 
		
		while (c > 1) {
			if (x%c == 0){ 
			 	return false;
			} else {
				c = c- 1;
			}
		
		}
		return true; 
	}
	
	public static void printPrimes(int b){
		int y = b; 
		//int c = x - 1; 
		
		while (y > 2 ) {
			if (checkPrime(y) == true){
				System.out.println(y); 
			}
			y = y - 1; 
	}
	}
	
	public static void main(String args[]) {
		System.out.println("Choose a number");
		int b = sc.nextInt(); 
		System.out.println("The prime numbers are"); 
		printPrimes(b); 
	}
}

