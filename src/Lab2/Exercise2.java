package Lab2;

import java.util.Arrays;

/*
 * Exercise 2: Create a method that can accept an array of String objects 
 * and sort in alphabetical order. The elements in the left half should be 
 * completely in uppercase and the elements in the right half should be completely in lower case. Return the resulting array.

Note: If there are odd number of String objects, then (n/2) +1 elements 
should be in UPPPERCASE

 */
public class Exercise2 {
	
	public String[] modifyStrArr(String[] strArr) {
		Arrays.sort(strArr);
		
		int n = strArr.length ; 
		
		//even
		if(n%2 == 0) {
			int i=0;
			//half lower
			for(  ; i<n/2 ; i++) {
				strArr[i] = strArr[i].toLowerCase() ;
			}
			//half upper
			for( ; i<n ; i++) {
				strArr[i] = strArr[i].toUpperCase() ;
			}
		}else {
			//odd
			int i=0 ;
			for( ; i<=n/2 ; i++) {
				strArr[i] = strArr[i].toUpperCase() ;
			}
			for( ; i<n ; i++) {
				strArr[i] = strArr[i].toLowerCase() ;
			}
		}
			
		return strArr ;
	}
	public static void main(String[] args) {
		Exercise2 e2 = new Exercise2() ;
		
		String[] str = {"taj","mahal","capg","sfdc","crm"} ;
		
		str = e2.modifyStrArr(str);
		
		for(String s: str) {
			System.out.println(s);
		}
		
	}
}
