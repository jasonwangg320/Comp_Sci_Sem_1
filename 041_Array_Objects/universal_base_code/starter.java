import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Warrior[] jose = new Warrior[100]; 
		int c; 
		c = 0; 
		while (c < 100){
			jose[c] = new Warrior(); 
			c++; 
		}
		c=0;
		Wizard[] kenneth = new Wizard[100]; 
		while (c < 100){
			kenneth[c] = new Wizard(); 
			c++; 
		}
		int c2 = 99; 
		int alive1 = 100; 
		int alive2 = 100; 
		while (kenneth[c2].isDead() == false || jose[c2].isDead() == false){
			kenneth[c2].attack(jose[c2]);
			jose[c2].attack(kenneth[c2]); 
			if(kenneth[c2].isDead() == true){
				alive1--;
			}
			if(jose[c2].isDead() == true){
				alive2 --; 
			}
			if (kenneth[c2].isDead()==true || jose[c2].isDead()==true){
				c2--; 
			}
			if (c2 == -1){
				break; 
			}
		}
		
		if (kenneth[0].isDead() == false){
			System.out.println("Wizards have won the war");
			System.out.println(alive1 + " wizards remain"); 
		} else if (jose[0].isDead() == false){
			System.out.println("Warriors have won the war"); 
			System.out.println(alive2 + " warriors remain"); 
		}
	}
}
		
	