import java.util.Scanner; 
class starter {
	
	public static int fact(int yee) {
		int y = yee; 
		int x = y -1; 
		
		while (true) { 
			System.out.println(y); 
		y = y * x; 
		if (x==1) { 
			break; 
		} 
		x = x - 1; 
	}
	
		return y; 
}
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in); 
		System.out.println("Choose an integer");
		int y = sc.nextInt();
		int answer = fact(y); 
		
		System.out.println(answer); 
	//	System.out.println(fact(5));
	
}
}