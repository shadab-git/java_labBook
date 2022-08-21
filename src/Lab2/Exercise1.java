package Lab2;

import java.util.Arrays;
import java.util.Collections;

/*
 * Exercise 1: Create a method which accepts an array of integer elements 
 * and return the second smallest element in the array
 */
public class Exercise1 {
	public int getSecondSmallest(int[] a) {
		
		Arrays.sort(a) ;
		
		//sorting in the ascending order and return the first element
		return a[0] ;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,1,4,6,7,5,9};
		Exercise1 e1 = new Exercise1() ;
		
		System.out.println(e1.getSecondSmallest(arr));
	}
}
