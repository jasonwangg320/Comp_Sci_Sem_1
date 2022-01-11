package pkg;
import java.util.Scanner;
import java.util.Random;
	
public class myCharacter {
	public String role; 
	public int strength; 
	public int dexterity; 
	public int intelligence; 
	public int consitution; 
	public int charisma; 
	
	public myCharacter() { 
		role = "pleb"; 
		strength = 0; 
		dexterity = 10; 
		intelligence = 0; 
		consitution = 5; 
		charisma = 0; 
	}
	public void myToString() {
		
		System.out.println("role: " + role); 
		System.out.println("strength: " + strength); 
		System.out.println("dexterity: " + dexterity); 
		System.out.println("intelligence: " + intelligence); 
		System.out.println("consitution: " + consitution); 
		System.out.println("charisma: " + charisma); 
		return; 
		
	}
}

