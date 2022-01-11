package pkg;
import java.util.Scanner;
import java.util.Random;


public class Warrior {
	public static String name; 
	public static int health; 
	public static int damage; 
	public static boolean life; 
	
	public Warrior() {
		name = " "; 
		health = 100; 
		damage = 5; 
		life = true; 
		
	}
	public Warrior(String a){
		String x = a; 
		name = x; 
	}
	public boolean isDead(){ 
		if (health > 0){
			return true;
		} else {
			return false; 
		}
		
	}
	public void attack(Wizard){ 
		Warrior.health = Warrior.health - Wizard.damage; 
		
	}
}
