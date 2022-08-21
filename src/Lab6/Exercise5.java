package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Exercise 5: Create a method which accepts an array of integer elements 
 * and return the second smallest element in the array
 */
public class Exercise5 {
	public int getSecondSmallest(int[] arr) {
		List l = new ArrayList() ;
		for(int i=0 ;i<arr.length ; i++) {
			l.add(arr[i]) ;
		}
		Collections.sort(l);
		int ans = (int)l.get(1) ;
		return ans ;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,4,3,7,0,1,6,8,4} ;
		
		Exercise5 e5 = new Exercise5() ;
		
		System.out.println(e5.getSecondSmallest(arr));
	}
}
