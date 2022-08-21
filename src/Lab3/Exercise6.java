package Lab3;

public class Exercise6 {
	public boolean checkIncreasingString(String str) {
		
		int len = str.length() ;
		
		//check for increasing string
		for(int i=0; i<len-1 ;  i++) {
			if(str.charAt(i+1)-str.charAt(i)<0) {
				return false ;
			}
		}
		
		return true ;
	}
	
	public static void main(String[] args) {
		
		Exercise6 e6 = new Exercise6() ;
		
		boolean check = e6.checkIncreasingString("abz") ;
		
		System.out.println(check);
		
		
	}
}
