import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter your first and last name"); 
			String name = sc.nextLine(); 
		int a = name.indexOf(" "); 
		System.out.println(name.substring(a+1)); 

		
	}
}
