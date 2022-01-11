import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
	int x = a; 
	int count = 1; 
	while (count<b) { 
		a = a*x; 
	count = count + 1;
	} 
	return a; 
	}
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in); 
	System.out.println("Pick a number"); 
	int base = sc.nextInt(); 
	System.out.println("Pick another number"); 
	int power = sc.nextInt(); 
	System.out.println(pow(base,power)); 
	


		
	}
}
