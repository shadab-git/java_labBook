package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Exercise 7: Create a method which accepts an integer array, 
 * reverse the numbers in the array and returns the resulting array in sorted order
 */
public class Exercise7 {
	public int[] getSorted(int[] arr) {
		
		List l = new ArrayList() ;
		
		for(int i=0; i<arr.length ; i++) {
			l.add(arr[i]) ;
		}
		
		Collections.reverse(l);
		Collections.sort(l);
		
		for(int i=0; i<arr.length ; i++) {
			arr[i] = (int)l.get(i) ;
		}
		
		return arr ;
	}
	
	public static void main(String[] args) {
		Exercise7 e7 = new Exercise7() ;
		
		int[] arr = {0,1,2,3,4,5} ;
		
		int[] sortedArr = e7.getSorted(arr);
		
		for(int x:sortedArr) {
			System.out.print(x + " ");
		}
	}
}
