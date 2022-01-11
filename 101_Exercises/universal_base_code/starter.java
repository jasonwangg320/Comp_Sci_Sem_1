import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Ascii troy = new Ascii("human"); 
		troy.printArt(); 
		
		Ascii kevin = new Ascii("cactus", "Leroy"); 
		kevin.printArt(); 
		
		Ascii kenneth = new Ascii("other", "jeff", 3); 
		kenneth.printArt(); 
		
		Ascii wenis = new Ascii();
		wenis.setType("other"); 
		wenis.setName("Jose"); 
		wenis.setNumber(0); 
		wenis.setAscii(" -___-  "); 
		
		Ascii benis = new Ascii("smile"); 
		benis.printArt(); 
		
	}
}
