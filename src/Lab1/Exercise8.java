package Lab1;
//Exercise 8: Create a method to check if a number is a power of two or not
public class Exercise8 {

	boolean checkNumber(int num) {
		if(num%2 != 0) {
			return false ;
		}
		int i =1 ;
		
		while(i<=num) {
			if(i == num) {
				return true ;
			}
			i = i*2 ;
		}
		return false ;
	}
	
	public static void main(String[] args) {
		Exercise8 e8 = new Exercise8() ;
		
		boolean ans = e8.checkNumber(64) ;
		System.out.println(ans);
		
	}
}
