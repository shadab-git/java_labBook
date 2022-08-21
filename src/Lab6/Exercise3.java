package Lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Exercise 3: Create a method which accepts an array of numbers and returns the numbers
 *  and their squares in Hashmap
 */
public class Exercise3 {
	public Map getSquares(int[] arr) {
		Map<Integer, Integer> myMap = new HashMap() ;
		for(int i=0 ; i<arr.length; i++) {
			myMap.put(arr[i], arr[i]*arr[i]) ;
		}
		return myMap;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter the n ");
		
		int n = sc.nextInt() ; //size of array
		
		System.out.println("Enter the n numbers");
		
		int[] arr = new int[n] ;
		
		//array input
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt() ;
		}
		Exercise3 e3 = new Exercise3() ;
		
		
		System.out.println(e3.getSquares(arr));
	}
}
