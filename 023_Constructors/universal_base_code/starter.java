import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in); 
	myCharacter jeff = new myCharacter(); 
		System.out.println("Role: " + jeff.role);
		System.out.println("Dexterity: " + jeff.dexterity);
		System.out.println("Intelligence: " + jeff.intelligence); 
		System.out.println("Constitution: " + jeff.constitution); 
		System.out.println("Charisma: " + jeff.charisma); 
	System.out.println(" ____________________");
	System.out.println("What role do you want?"); 
		String a = sc.nextLine(); 
	//myCharacter jeff = new myCharacter();
		//System.out.println(jeff); 
	myCharacter leroy = new myCharacter(); 
		leroy.myCharacter(a);
		System.out.println("Strength: " + leroy.strength); 
		System.out.println("Dexterity: " + leroy.dexterity);
		System.out.println("Intelligence: " + leroy.intelligence); 
		System.out.println("Constitution: " + leroy.constitution); 
		System.out.println("Charisma: " + leroy.charisma); 
	}
}
