import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static String name1; 
	public static String name2; 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("what is your dogs name?"); 
			name1 = sc.nextLine(); 
		System.out.println("how old is doggo?"); 
			int age1 = sc.nextInt(); 
			sc.nextLine();
		dog jose = new dog(name1, age1);
		
		System.out.println("what is your second dogs name"); 
			name2 = sc.nextLine(); 
		System.out.println("what is the doggos breed"); 
			String breed2 = sc.nextLine(); 
		dog twatson = new dog(name2, breed2); 
	
		if (jose.isSleeping()) {
			System.out.println(name1 + " is sleeping"); 
		} else { 
			System.out.println(name1 + ": Bark Bark"); 
		}
	
		if (!twatson.isSleeping()) { 
			System.out.println(name2 + " is barking too"); 
				twatson.bark(); 
		} else {
			System.out.println(name2 + " is barking too"); 
			twatson.bark(); 
				}
		
		
	}
}
