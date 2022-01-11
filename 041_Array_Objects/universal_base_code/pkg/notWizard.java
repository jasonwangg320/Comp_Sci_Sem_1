package pkg;
import java.util.Scanner;
import java.util.Random;


public class Wizard {
	public static String name; 
	public static int health; 
	public static int damage; 
	public static boolean life; 
	
	public Wizard() {
		name = " "; 
		health = 100; 
		damage = 5; 
		life = true; 
	}
	public Wizard(String b){
		String x = b; 
		name = x; 
	}
	public boolean isDead(){ 
		if (health > 0){
			return true;
		} else {
			return false; 
		}
		
	}
	public void attack (Warrior){ 
		Wizard.health = Wizard.health - Warrior.damage; 
	}

}
