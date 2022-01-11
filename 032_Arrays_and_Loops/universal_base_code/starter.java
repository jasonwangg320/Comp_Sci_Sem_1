import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random(); 
		int[]a = new int[1000]; 
		int c = 0; 
		int c2 = 0; 
		
		while (c < a.length) { 
			a[c] = rand.nextInt(10) + 1; 
			c++; 
		} 
		while (c2 < a.length) { 
			System.out.println(a[c2]); 
			c2 ++; 
			}
	
		
		


		
	}
}
