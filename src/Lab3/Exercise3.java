package Lab3;


/*
 * Exercise 3: Create a method which accepts a String and replaces all the 
 * consonants in the String with the next alphabet. 
Note: Consonant refers to all alphabets excluding vowels

 */
public class Exercise3 {
	//checking for consonant the letter which is not present in the vowels array will be consonant
	boolean checkConsonant(char ch){
		char[] vowels = {'a','e','i','o','u', 'A','E','I','O','U'} ;
		boolean found ;
		for(char item:vowels) {
			if(ch==item) {
				found = false ;
				return found ;
			}
		}
		return true ;
	}
	public String alterString(String str) {
		String newStr = "" ;
	
		
		int len = str.length() ;
		
		for(int i=0; i<len ; i++) {
			boolean found = checkConsonant(str.charAt(i)) ;
			if(found) {
				char letter = str.charAt(i);
				letter++ ;
				newStr = newStr + letter ;
				continue;
			}
			//appending to the string
			newStr = newStr + str.charAt(i) ;	
		}
		return newStr ;
	}
public static void main(String[] args) {
	Exercise3 e3 = new Exercise3() ;
	
	System.out.println(e3.alterString("aAbBcCdD")); //aAcCdDeE
	
}
}
