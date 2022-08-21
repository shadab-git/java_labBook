package Lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Exercise 4:  school offers medals to the students of tenth based on the following criteria 
If(Marks>=90) : Gold 
If(Marks between 80 and 90) : Silver 
If(Marks between 70 and 80) : Bronze 
Note: Marks between 80 and 90 means marks>=80 and marks<90 

Write a function which accepts the marks of students as a Hashmap and return the details of the 
students eligible for the medals along with type of medal. 
The input Hashmap contains the student registration number as key and mark as value. 
The output Hashmap should contain the student registration number as key and the medal type as value.

 */
public class Exercise4 {
	public Map getStudents(Map stds) {
		Map<Integer, String> winstds = new HashMap() ;
		
		Set<Entry<Integer, Integer>> entries = stds.entrySet() ;
		
		String[] medal = {"Gold", "Silver", "Bronze"} ;
		
		for(Entry<Integer, Integer> entry : entries) {
			Integer regno = entry.getKey() ;
			Integer marks = entry.getValue() ;
			
			//marks condition
			if(marks>=90) {
				winstds.put(regno, medal[0]) ;
			}
			else if(marks<90 && marks>=80) {
				winstds.put(regno, medal[1]) ;
			}
			else if(marks<80 && marks>=70) {
				winstds.put(regno, medal[2]) ;
			}
		}
		return winstds ;
	}
	
	public static void main(String[] args) {
		Map<Integer, Integer> stds = new HashMap() ;
		
		stds.put(1,38) ;
		stds.put(2,90) ;
		stds.put(3,98) ;
		stds.put(4,78) ;
		stds.put(5,88) ;
		stds.put(6,68) ;
		
		Exercise4 e4 = new Exercise4() ;
		System.out.println(e4.getStudents(stds));
	}
}
