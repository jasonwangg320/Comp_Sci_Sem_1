import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random(); 
		int[]a = new int[100]; 
		int c = 0; 
		int min = 100;
		int max = 0; 
		int total = 0; 
		int avg; 
		
		while(c < a.length) { 
			a[c] = rand.nextInt(100) + 1; 
			if (a[c] < min) {
				min = a[c]; 
			}
			if (a[c] > max) {
				max = a[c]; 
			}	
			total = total + a[c]; 
			c++; 
		}
		avg = total/a.length; 
		System.out.println("There are " + a.length + " elements"); 
		System.out.println("min: " + min); 
		System.out.println("max: " + max); 
		System.out.println("avg: " + avg); 


		
	}
}
