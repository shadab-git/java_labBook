package Lab6;

import java.util.HashMap;
import java.util.Map;

/*
 * Exercise2 Collection: Create a method that accepts a character array and 
 * count the number of times each character is present in the array.
 */
public class Exercise2 {
	public Map countChars(char[] charArr) {
		int count = 0 ;
		Map<Character, Integer> countMap = new HashMap() ;
		for(int i=0; i<charArr.length ; i++) {
			count =0 ;
			for(int j=0; j<charArr.length; j++) {
				if(charArr[i]==charArr[j]) {
					count++ ;
				}
			}//inner loop
			//hashmap
			countMap.put(charArr[i], count) ;
		}//outerloop
		
		return countMap ;
	}
	public static void main(String[] args) {
		Exercise2 e2 = new Exercise2() ;
		
		char[] ca = {'a','b','a','d','d','b','d'} ;
		
		Map m = e2.countChars(ca) ;
		System.out.println(m);
		
	}
}
