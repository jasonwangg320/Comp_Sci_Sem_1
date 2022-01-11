import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Choose your name");
		String name = sc.nextLine();
	System.out.println("Your name " + name);
	//bullet point 1
	System.out.println("Choose your character title");
		String title = sc.nextLine();
	System.out.println("Your character title is " + title);
	//bullet point 2 
	System.out.println("Choose your role: Wizard, Rogue, Warrior");
	String role = sc.nextLine();
	
	if (role.equals("Wizard")) {
		System.out.println("Ur role is Wizard");
	} 
	else if (role.equals("wizard")){
		System.out.println("Ur role is Wizard");
	}
	else if (role.equals("Warrior")){
		System.out.println("Ur role is Warrior");
	} 
	else if (role.equals("warrior")){
		System.out.println("Ur role is Warrior)");
	}
	else if (role.equals("Rogue")) {
		System.out.println("Ur role is Rogue");
	}
	else if (role.equals("rogue")) {
		System.out.println("Ur role is Rouge");
	//bullet point 3	
	}



	System.out.println("U have a maximum of 25 points to spend");
		int points = 25;
		
	System.out.println("How much strength do you want (0-10)");
		int strength = sc.nextInt();
		int a = points - strength; 
	if (strength < 10){
		System.out.println("U have "+ a + " points remaining");
	} 
	else {
		System.out.println("U can only add 10 points"); 
	}
	
		System.out.println("How much dexterity do you want (0-10)");
		int dexterity = sc.nextInt();
		int b = a - dexterity;
	if (dexterity < 10) {
		System.out.println("U have " + b + " points remaining"); 
	} 
	else {
		System.out.println("U can only add 10 points"); 
	}
	
	System.out.println("How much intelligence do you want (0-10)");
		int intelligence = sc.nextInt();
		int c = b - intelligence;
	if (intelligence < 10) {
		System.out.println("U have " + c + " points remaining"); 
	}
	else { 
		System.out.println("U can only add 10 points"); 
	}
		
	System.out.println("How much constitution do you want (0-10)"); 
		int constitution = sc.nextInt();
		int d = c - constitution; 
	if (constitution < 10) { 
		System.out.println("U have " + d + " points remaining");
	} 
	else { 
		System.out.println("U can only add 10 points");
	}
	System.out.println("How much charisma do you want (0-10)");
		int charisma = sc.nextInt();
		int e = d - charisma;
	if (charisma < 10) {
		System.out.println("U have " + e + " points remaining");
	}
	else {
		System.out.println("U can only add 10 points"); 
	}


	
	System.out.println("Name: " + name);
	System.out.println("Title: " + title);
	System.out.println("Strength: " + strength);
	System.out.println("Dexterity: " + dexterity);
	System.out.println("Intelligence: " + intelligence);
	System.out.println("Constitution: " + constitution); 
	System.out.println("Charisma: " + charisma); 
	}
}
