package pkg; 

public class myCharacter {
	public String role; 
	public int strength; 
	public int dexterity; 
	public int intelligence; 
	public int consitution; 
	public int charisma; 
	
	public myCharacter() { 
		role= "no role"; 
		strength = 0; 
		dexterity = 0; 
		intelligence = 0; 
		consitution = 0; 
		charisma = 0; 
	}
		public String setRole(String a) {
			role = a; 
			if (role.equals("Wizard") || role.equals("wizard")){
				System.out.println("U have choose Wizard");
				role = "wizard"; 
				return role; 
			} 
			else if (role.equals("Warrior") || role.equals("warrior")){
				System.out.println("U have choose Warrior"); 
				role = "warrior"; 
				return role; 
			}
			else if (role.equals("Rogue") || role.equals("rogue")){
				System.out.println("U have choosen Rogue");
				role = "rogue";
				return role; 
			}
			return "no role chosen"; 
	}
		public int setStrength(int b) { 
			strength = strength + b; 
			System.out.println("Strength: " + strength); 
			return strength; 
		}
		public int setDexterity(int c) { 
			dexterity = dexterity + c; 
			System.out.println("Dexterity: " + dexterity); 
			return dexterity; 
		}
		public int setIntelligence(int d) { 
			intelligence = intelligence + d; 
			System.out.println("Intelligence: " + intelligence); 
			return intelligence;  
		}
		public int setConstitution(int e) { 
			consitution = consitution + e; 
			System.out.println("Constitution: " + consitution); 
			return consitution;  
		}
		public int setCharisma(int f) { 
			charisma = charisma + f; 
			System.out.println("Charisma: " + charisma); 
			return charisma;  
		}
		public boolean setAll(String a, int b, int c, int d, int e, int f) { 
			if (a.equals(role) && b == strength && c == dexterity && d == intelligence && e == consitution && f == charisma) {
				System.out.println("Your values have been accepted"); 
				return true;
			}
			System.out.println("Your values have not been accepted"); 
			return false; 
		}
		public int levelUp() {
			int level = 0; 
			int points = 0; 
			if (level == 1) { 
				points = points + 25; 
				System.out.println("You have " + points + " points to spend"); 
				System.out.println("How much do you wanna put into strength");
					int b = sc.nextInt(); 
				System.out.println("How much do you wanna put into dexterity");
					int c = sc.nextInt(); 
				System.out.println("How much do you wanna put into intelligence"); 
					int d = sc.nextInt(); 
				System.out.println("How much do you wanna put into consitution"); 
					int e = sc.nextInt(); 
				System.out.println("How much do you wanna put into charisma"); 
					int f = sc.nextInt();
			}
			
			while (level > 1) {
				points = points + 10; 
				System.out.println("You have " + points + " points to spend");
				System.out.println("You cannot put negative number"); 
				while (true) {
					System.out.println("How much do you wanna put into strength");
					int b = sc.nextInt(); 
					if (b > 10) {
						System.out.println("I said less than 10");
					} else {
						break; 
					}
				}
				System.out.println("How much do you wanna put into dexterity");
					int c = sc.nextInt(); 
				System.out.println("How much do you wanna put into intelligence"); 
					int d = sc.nextInt(); 
				System.out.println("How much do you wanna put into consitution"); 
					int e = sc.nextInt(); 
				System.out.println("How much do you wanna put into charisma"); 
					int f = sc.nextInt();
			}
				
		}
}


