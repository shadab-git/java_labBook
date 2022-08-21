package Lab2;

import java.util.ArrayList;
import java.util.List;

/*
 * Exercise 4: Create a method which accepts an integer array and removes all the duplicates in the array.
 *  Return the resulting array in descending order
 */

public class Exercise4 {
	public int[] modifyArray(int[] arr) {
		
		List l = new ArrayList() ;
		
		//finding max in the array
		int max = -99999999;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i] ;
			}
		}
		
		//temporary array for marking
		int[] tmpArr = new int[max+10] ;
		
		//marking duplicates and adding unique in the list 
		for(int i =0 ;i< arr.length ; i++) {
			if(tmpArr[arr[i]]!=0) {
				//arr[i] = 0;
				continue ;
			}
			tmpArr[arr[i]] =1 ;
			l.add(arr[i]) ;
		}
		
		int[] newArr = new int[l.size()] ;
		
		//adding list object to int[]
		for(int i=0 ; i<l.size() ; i++) {
			newArr[i] = (int)l.get(i) ;
		}

		return newArr ;
	}
	
	
	public static void main(String[] args) {
		Exercise4 e4 = new Exercise4() ;
		
		int[] a = {1,4,4,3,8,8,9,0,1,0};
		
		a = e4.modifyArray(a) ;
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
}
