import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Give me a word"); 
			String a = sc.nextLine(); 
		int b = a.length(); 
		int c = 0; 
		while (c < b){
			System.out.println(a.substring(c, c+1)); 
			c++; 
		}

		
	}
}
