package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Exercise 1: Create a method which accepts a hash map and return the values of the map 
 * in sorted order as a List.
 */
public class Exercise1 {
	public List getValues(Map myMap) {
		List l = new ArrayList() ;
		
		Set<Entry<Integer, Integer>> entries = myMap.entrySet() ;//set view
		
		for(Entry<Integer, Integer> entry : entries) {
			Integer val = entry.getValue() ;
			l.add(val) ;
		}
		//sort
		Collections.sort(l);
		return l ;
		
	}
	
	public static void main(String[] args) {
		Exercise1 e1 = new Exercise1() ;
		
		Map myMap = new HashMap() ;
		
		myMap.put(0, 20) ;
		myMap.put(1, 50) ;
		myMap.put(3, 10) ;
		myMap.put(4, 70) ;
		myMap.put(5, 90) ;
		
		List list = e1.getValues(myMap);
		System.out.println(list);
		
		
	}
}
