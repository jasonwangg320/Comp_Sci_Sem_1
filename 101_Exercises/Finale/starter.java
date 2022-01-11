import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static int getMedian(int[]a){
		if (a.length%2 == 0)
			return ((a[a.length / 2 - 1] + a[a.length / 2]) / 2); 
		return a[(a.length / 2)]; 
		
		
	}
	

	public static int getMode(int[]a){
		int counter = 0; 
		int counter2 = 0; 
		int temp =1; 
		int temptemp = 1; 
		int actualtemp = 0; 
		while (counter < a.length){
			while (counter2 < a.length) {
				if (a[counter] == a[counter2]){
					temp++; 
				}
				counter2++;
			}
			if (temp > 1){
			actualtemp = a[counter]; 
			}
			//value of mode if there are more than 1
			if (temp > temptemp){
				temptemp = temp; 
			}
			//if occurance of index is more --> mode is new index
			counter++; 
		}
		return actualtemp; 
	}
	
	
	public static void main(String args[]) {
		// Your code goes below here
		//BaseClass test = new BaseClass();
		int [ ] arr4 = {1, 2, 3, 4, 5, 6, 7};
		int [ ] arr5 = {1, 2, 3, 4, 5, 6};
		System.out.println(getMedian(arr4)); 
		System.out.println(getMedian(arr5)); 
		int [ ] arr1 = {2, 7, 4, 3, 8, 5, 5, 3, 5, 6};	
		int [ ] arr2 = {2, 7, 9, 7, 1, 7, 2, 8, 2};
		int [ ] arr3 = {2, 6, 4, 5, 3, 8, 9, 1};
		System.out.println(getMode(arr1)); 
		System.out.println(getMode(arr2)); 
		System.out.println(getMode(arr3)); 
	}
}
