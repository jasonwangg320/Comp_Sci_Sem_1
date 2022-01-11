import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in); 
		
		int c = 0; 
		System.out.println("Enter a phrase now"); 
			String phrase = sc.nextLine();
		int x = phrase.length(); 
		String temp = phrase; 
		x = x -1; 
		String yes = ""; 
		
		for(int c2 = 0; c2<phrase.length(); c2++ ){
			if(phrase.substring(c2,c2+1).compareTo(" ") == 0){
				temp = phrase.substring(c, phrase.indexOf((" "), c));
				c = phrase.indexOf((" "), c)+1; 
				yes = temp + " " + yes; 
				System.out.println(temp); 
			}
			if(phrase.indexOf((" "),c) == -1) {
				temp = phrase.substring(c, phrase.length()); 
				yes = temp + " " + yes; 
				break; 
			}
		}
		System.out.println(yes); 
	}
}