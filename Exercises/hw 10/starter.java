import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random(); 
		int[]a = new int [20]; 
		int c = 0; 
		while ( c <= 19) { 
			a[c] = rand.nextInt(10) + 1; 
			c++; 
		}
		
		int target = rand.nextInt(10) + 1; 
		System.out.println("Target number: " + target); 
		int counter2 = 0; 
		System.out.println("Indices of duplicates: "); 
		for (c = 0; c < a.length; c++){
			if (a[c] == target){
				System.out.println(c); 
				counter2++; 
			}
		}
		System.out.println("Number of duplicates: " + counter2); 

		System.out.println("Consecutive numbers--> Indices = number: "); 
		for (c = 0; c < 19; c++) { 
			if (a[c] == a[c+1]){ 
				System.out.println("Index " + c + " = " + " number " + a[c]);
				System.out.println("Inxdex " + (c+1) + " = " + " number " + a[c+1]); 
			}
		}
	}
}

