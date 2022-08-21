package Lab1;
//Exercise 7: Create a method to check if a number is an increasing number
public class Exercise7 {

	boolean checkNumber(int num) {
		int checkNum = 999999999;
		while(num!=0) {
			int mod = num%10 ;
			if(mod<=checkNum) {
				checkNum = mod ;
				num = num/10 ;
			}
			else {
				return false ;
			}
		}
		return true ;
	}
	
	public static void main(String[] args) {
		Exercise7 e7 = new Exercise7() ;
		
		boolean check = e7.checkNumber(134468);
		System.out.println(check);
	}
}
