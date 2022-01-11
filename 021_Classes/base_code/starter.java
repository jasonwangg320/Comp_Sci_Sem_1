import java.util.Scanner;
import java.util.Random;

class Character { 
String role = new String("Wizard"); 
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
int strength = 5; 
int dexterity = 5; 
int intelligence = 5; 
int constitution = 5; 
int charisma = 5; 
Character troy = new Character(); 
System.out.println("your role is " + troy.role); 
System.out.println("your strength is " + strength); 
System.out.println("your dexterity is " + dexterity); 
System.out.println("your intelligence is " + intelligence); 
System.out.println("your constitution is " + constitution); 
System.out.println("your charisma is " + charisma);
	}
}
