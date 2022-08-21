package Lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Exercise 6: Create a method which accepts the id and the age of people as a Map and decide 
 * if they are eligible for vote. A person is eligible for vote if his age is greater than 18. 
 * Add the IDs of all the eligible persons to list and return the list. 
 */
public class Exercise6 {
	public List votersList(Map votersMap) {
		List l = new ArrayList() ;
		
		Set<Entry<Integer, Integer>> entries = votersMap.entrySet() ;
		
		for(Entry<Integer,Integer> entry: entries) {
			Integer id = entry.getKey() ;
			Integer age = entry.getValue() ;
			if(age>18) {
				l.add(id) ;
			}
		}
		return l ;
	}
	public static void main(String[] args) {
		Exercise6 e6 = new Exercise6() ;
		
		Map<Integer, Integer> votersMap = new HashMap() ;
		
		votersMap.put(1, 16) ;
		votersMap.put(2, 18) ;
		votersMap.put(3, 20) ;
		votersMap.put(4, 30) ;
		votersMap.put(5, 21) ;
		
		System.out.println(e6.votersList(votersMap));
	}
}
