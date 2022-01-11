import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public int c = 0; 
	
	public static void toStringArray(int []a) { 
		int c = 0; 
		while (c < a.length ) { 
			System.out.print(a[c] + ", "); 
			c ++;  
		}
		System.out.println(); 
		return; 
	}
	public static int getArrayAverage(int []a) { 
		int c = 0; 
		int t = 0; 
		while (c < a.length) { 
			t = t + a[c];
			c++; 
		} 
		int avg = t / c; 
		return avg; 
	} 
	public static int getArrayMax(int []a) { 
		int max = 0; 
		int c = 0; 
		while (c < a.length) { 
			if (max > a[c]) { 
				max = max; 
			} else {
				max = a[c]; 
			} 
		c++; 
	} 
	return max; 
	}
	public static int getArrayMin(int []a){ 
		int min = 100; 
		int c = 0; 
		while (c < a.length){ 
			if (min < a[c]){
				min = min; 
			} else { 
				min = a[c];
			} 
			c ++; 
	}
		return min; 
		
	}
	
	public static void main(String args[]) {
		// Your code goes below here
	//	BaseClass test = new BaseClass();
		int []a = new int[100]; 
		Random rand = new Random(); 
		int c = 0; 
		while(c < 100){
			a[c] = rand.nextInt(100) + 1; 
			c++; 
		}
		System.out.print("Elements: ");
		toStringArray(a); 
		System.out.println("Average: " + getArrayAverage(a)); 
		System.out.println("Max: " + getArrayMax(a)); 
		System.out.println("Min: " + getArrayMin(a)); 
	}
}
