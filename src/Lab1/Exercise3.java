package Lab1;
/*
 * Exercise 3: The Fibonacci sequence is defined by the following rule. 
 * The first 2 values in the sequence are 1, 1. 
 * Every subsequent value is the sum of the 2 values preceding it. 
 * Write a Java program that uses both recursive and non-recursive functions 
 * to print the nth value of the Fibonacci sequence?
 */
public class Exercise3 {
	
	int n ;
	
	//initial values
	int a =1 , b = 1 ,  c = 0;
	
	
	public Exercise3() {
		this.n = 0 ;
	}
	
	public Exercise3(int n) {
		this.n = n ;
	}
	
	//loop 
	public void nthFibNumLoop() {
		int count = 2 ;
		if(n == 1 || n ==2) {
			System.out.println(1);
			return ;
		}
		else if(n==0) {
			System.out.println(0);
			return ;
		}
		else {
			while(count!=n) {
				//adding previous values and assigning to next and swaping the previous ones
				c= a+b ;
				a=b ;
				b =c;
				
				count = count +1 ;
			}
		}
		System.out.println(c);
	}
	
	//recursion
	public int nthFibNumRecursive(int n) {
		if(n==0) {
			return 0 ;
		}
		else if(n==1) {
			return 1 ;
		}
		else {
			return nthFibNumRecursive(n-1) + nthFibNumRecursive(n-2) ;
		}
	}
	
	public static void main(String[] args) {
		Exercise3 e3 = new Exercise3(6) ;
		
		e3.nthFibNumLoop();
		int num = e3.nthFibNumRecursive(6);
		System.out.println(num);
		
	}
	
}
