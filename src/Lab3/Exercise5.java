package Lab3;

import java.util.StringTokenizer;

/*\
 * Exercise 5: Write a Java program that displays the number of characters, lines and words
 *  in a text? 
 */
public class Exercise5 {
	public int numOfChar(String str) {
		int len = str.length() ;
		return len ;
	}
	public int numOfLines(String str) {
		String lines[] = str.split("\n");
		return lines.length ;
	}
	
	public int numOfWords(String str) {
		String[] words = str.split(" ") ;
		return words.length ;
	}
	
	public static void main(String[] args) {
		Exercise5 e5 = new Exercise5() ;
		
		String str = "Ahmad Shadab Ansari" ;
				
		System.out.println(e5.numOfChar(str)); //19
				
		//System.out.println(e5.numOfLines(str)); 
		
		System.out.println(e5.numOfWords(str)); 
	}
}
