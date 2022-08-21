package Lab3;

public class Exercise2 {
	public String getImage(String str) {
		
		//using string buffer to take advantage of reverse fucntion
		StringBuffer sbr = new StringBuffer(str) ;
		
		sbr.reverse() ;//reversing
		
		String revStr = new String(sbr) ;
		
		String fullMirror = str + " | " + revStr ; //concatinating
		
		return fullMirror ;
	}
	
	public static void main(String[] args) {
		Exercise2 e2 = new Exercise2() ;
		
		String str = "Hello World" ; 
		
		System.out.println(e2.getImage(str));
	}
}
