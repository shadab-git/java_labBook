package Lab1;
/*
 * Exercise 4: Write a Java program that prompts the user for an integer and 
 * then prints out all 
 * the prime numbers up to that Integer?
 * 
 */
public class Exercise4 {
	
	public Exercise4() {
	}
	
	public void primeNums(int n) {
		if(n==1) {
			System.out.println(1);
			return ;
		}
		int i, j ;
		System.out.print(1 + " ");
		for(i =2 ; i<=n; i++) {
			for( j=2; j<=i; j++) {
				if(i%j == 0) {
					break ;
				}
			}
			if(j==i) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		Exercise4 e4 = new Exercise4() ;
		
		e4.primeNums(11);
	}
}
