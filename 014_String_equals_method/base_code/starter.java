import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.println("Choose: Wizard, Warrior, or Rogue");
		String role = sc.nextLine();
		
	if (role.equals("Wizard")){
		System.out.println("U have choosen Wizard");
	} 
	else if (role.equals("Warrior")){
		System.out.println("U have choosen Warrior");
	}
	else if (role.equals("Rogue")){
		System.out.println("U have choosen Rogue");
	}
	else if (role.equals("wizard")){
		System.out.println("U have choosen Wizard");
	}
	else if (role.equals("warrior")){
		System.out.println("U have choosen Warrior");
	}
	else if (role.equals("rogue")){
		System.out.print("U have choosen Rogue");
	}
	}
}
