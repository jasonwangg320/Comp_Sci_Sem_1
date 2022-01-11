package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ogre {
	public static String name;
	public boolean ugly; 
	public Ogre() {
		name = "Shrek";
		ugly = true;
	}

	public String getName(){
		return name;
	}

	public boolean isUgly(){
		return ugly;
	}

	public void interact(Donkey donkey){
		System.out.println(Donkey.name + ", what are you doing in my swamp?!");
		return;
	}


}
