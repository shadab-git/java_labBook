package Lab1;
/*
 * Exercise 5: Create a class with a method 
 * which can calculate the sum of first n natural numbers 
 * which are divisible by 3 or 5.
 */
public class Exercise5 {

	public boolean check3or5(int num) {
		if(num%3 ==0 || num%5 ==0) {
			return true ;
		}
		return false ;
	}
	public int sumOfNaturalNum(int n) {
		int sum = 0 ;
		for(int i =1 ; i<=n ; i++) {
			boolean divisible = check3or5(i) ;
			if(divisible) {
				sum = sum + i ;
			}
		}
		return sum ;
	}
	
	public static void main(String[] args) {
		Exercise5 e5 = new Exercise5() ;
		
		int ans = e5.sumOfNaturalNum(9);
		System.out.println(ans);
		
	}
}
