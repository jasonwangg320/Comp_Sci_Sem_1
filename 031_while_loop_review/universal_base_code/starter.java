import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random(); 
		int c = 0; 
		int a; 
		while (true){
			a = rand.nextInt(100) + 1; 
			System.out.println(a); 
			c++; 
		if (c == 100){
			break; 
		}
		}

		
	}
}
