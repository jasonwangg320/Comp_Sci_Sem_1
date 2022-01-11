package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter{
	public String role; 
	public int strength; 
	public int dexterity; 
	public int intelligence; 
	public int constitution; 
	public int charisma; 

	public myCharacter () { 
		role = "no role"; 
		strength = 0; 
		dexterity = 0; 
		intelligence = 0; 
		constitution = 0; 
		charisma = 0; 
	} 
	
		public String myCharacter(String a) { 
			role = a;
			//Scanner sc = new Scanner(System.in); 
			System.out.println("U have chosen " + role);
			//a = sc.nextLine(); 
			return role; 
		}
}
	
//String a = new String("Wizard"); 
//	myCharacter troy = new myCharacter(a); 


		
	



