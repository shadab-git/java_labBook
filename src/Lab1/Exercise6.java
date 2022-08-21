package Lab1;
/*
 * Exercise 6: Create a class with a method to 
 * find the difference between the sum of the squares 
 * and the square of the sum of the first n natural numbers.
 */
public class Exercise6 {
	
	int sumFirstN(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		return sum*sum ;
	}
	
	int sumFirstNsquare(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum + i*i;
		}
		return sum ;
	}
	
	public int sumDifference(int n) {
		int ans = sumFirstNsquare(n) - sumFirstN(n) ;
		return ans ;
	}
	
	public static void main(String[] args) {
		Exercise6 e6 = new Exercise6() ;
		
		int ans = e6.sumDifference(3) ;
		System.out.println(-ans);
	}
}
