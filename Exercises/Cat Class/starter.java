import pkg.*;
import java.util.Scanner;
import java.util.Random;

class cat {
	public String name; 
	
	public cat() {
		name = "Garfield"; 
		
	}
	public cat(String a) { 
		name = a; 
	} 
	public void meow() { 
		System.out.println(name + " is meowing"); 
	} 
}

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		cat Garfield = new cat(); 
	
		System.out.println("What is your cats name?"); 
			String name = sc.nextLine(); 
		cat bussy = new cat(name); 
		Garfield.meow(); 
		bussy.meow(); 
		
	}
}
