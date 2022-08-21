package Lab3;

import java.util.StringTokenizer;

//Exercise 1: Write a Java program that reads a line of integers and then 
//displays each integer and the sum of all integers. (Use String Tokenizer class)?


public class Exercise1 {
	public int lineOfInt(String loi) {
		
		//to break the string
		StringTokenizer st = new StringTokenizer(loi, " ") ;
		
		int sum =0 ;
		
		while(st.hasMoreTokens()) {
			String nxttoken = st.nextToken() ;
			System.out.print(nxttoken + " ");
			
			//parsing the int value in the string to integer and adding consecutive sum
			sum = sum + Integer.parseInt(nxttoken) ;
		}
		System.out.println();
		
		return sum ;
	}
	
	public static void main(String[] args) {
		Exercise1 e1 = new Exercise1() ;
		
		String s = "100 000 12 400" ;
		
		int ans = e1.lineOfInt(s) ;
		System.out.println(ans);
	}
}
