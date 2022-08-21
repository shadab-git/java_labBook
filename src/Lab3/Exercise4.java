package Lab3;
/*
 * Exercise 4: Create a method that accepts a number and modifies it such that 
 * the each of the digit in the newly formed number is equal to the difference between 
 * two consecutive digits in the original number. The digit in the units place can be
 *  left as it is. 
Note: Take the absolute value of the difference. Ex: 6-8 = 2

 */
public class Exercise4 {
	public int modifyNum(int num) {
		String str;
		String newStr ="" ;
		int tempNum = num ;
		str = Integer.toString(tempNum) ;
		
		int len = str.length() ;
		
		for(int i=0; i<len ; i++ ) {
			if(len==1) {
				return num ;
			}
			else if(i==len-1) {
				newStr = newStr + str.charAt(i) ;
				break ;
			}
			char li = str.charAt(i) ;
			char li2 = str.charAt(i+1) ;
			int diff = li2-li ;
			if(diff < 0) {
				diff = li - li2 ;
			}
			newStr = newStr + (diff);
		}
		
		int newNum = Integer.parseInt(newStr) ;
		return newNum ;
	}
	public static void main(String[] args) {
		
		Exercise4 e4 = new Exercise4() ;
		
		System.out.println(e4.modifyNum(2321)) ;
		
		
	}
}
