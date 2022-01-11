import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Choose a name");
		String name = sc.nextLine(); 
	
	System.out.println("How many times do you want to see it");
		int times = sc.nextInt(); 
		
		int c = 1; 
		while(true)
	{
		System.out.println(name);
		if (c==times)
		{
			break;
		}
		c = c + 1; 
	}

		
	}
}
