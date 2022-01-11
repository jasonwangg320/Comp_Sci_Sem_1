package pkg;
import java.util.Scanner;
import java.util.Random;


public class dog {
	public static Scanner sc = new Scanner(System.in); 
	public static Random rand = new Random(); 
	public String name; 
	public int age; 
	public String breed; 
	
	public dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog"; 
	}
	
	public dog(String a){ 
		name = a; 
		age = 1; 
		breed = "dog dog";
	} 
	
	public dog(String a, String b) { 
		name = a; 
		age = 1; 
		breed = b; 
	} 
	
	public dog(String a, int b) {
		name = a; 
		age = b; 
		breed = "dog dog"; 
	}
		public void setName(String a) { 
			name = a;
			return; 
		}
		public void setAge(int a) {
			age = a;
			return; 
		}
		public void setBreed(String a) {
			breed = a;
			return; 
		}
		public String getName(){
			return name; 	
		}
		public int getAge(){
			return age; 
		}
		public String getBreed(){
			return breed; 
		}
		public boolean isSleeping() { 
		 	int slump = rand.nextInt(2); 
		 	if (slump == 1) { 
		 		return true; 
		 	} else { 
		 		return false;
		 	}
		}
		public void bark() { 
			System.out.println(name + " is barking"); 
			return; 
		}
}

