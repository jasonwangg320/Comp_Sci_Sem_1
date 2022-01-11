import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static Scanner sc = new Scanner(System.in); 
	public static void main(String args[]) {
		// Your code goes below here
	myCharacter jeff = new myCharacter();
	System.out.println("Choose a role"); 
		String	a = sc.nextLine();
	jeff.setRole(a); 
	
	System.out.println("How many points do you want in strength"); 
		int b = sc.nextInt(); 
	jeff.setStrength(b); 
	
	System.out.println("How many points do you want in dexterity"); 
		int c= sc.nextInt(); 
	jeff.setDexterity(c);
	System.out.println("How many points do you want in intelligence"); 
		int d= sc.nextInt(); 
	jeff.setIntelligence(d); 
	System.out.println("How many points do you want in consitution"); 
		int e= sc.nextInt(); 
	jeff.setConstitution(e); 
	System.out.println("How many points do you want in charisma"); 
		int f= sc.nextInt(); 
	jeff.setCharisma(f); 
	jeff.setAll(a, b, c, d, e, f); 
}
}
