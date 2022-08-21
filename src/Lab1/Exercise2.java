package Lab1;

/*
 * Exercise 2: Write a java program that simulates a traffic light.
 * The program lets the user select one of three lights: 
 * red, yellow, or green with radio buttons. 
 * On entering the choice, an appropriate message with “stop” or “ready” or “go”
 *  should appear in the console .Initially there is no message shown.
 */

public class Exercise2 {
	
	
	String choice ="" ;
	
	public Exercise2() {
	}
	
	public Exercise2(String choice) {
		this.choice = choice.toLowerCase()  ;
		
	}
	
	public void message() {
		String[] msg = {"Stop", "Go", "Ready" } ;
		String retMsg ="" ;
		
		//using switch case to match the msg
		switch (choice){
			case "red":
				retMsg = msg[0] ;
				break;
			case "green":
				retMsg =  msg[1] ;
				break ;
			case "yellow":
				retMsg = msg[2] ;
				break ;
			default :
				System.out.println();
		}
		System.out.println(retMsg) ;
	}
	
	public static void main(String[] args) {
		Exercise2 e2 = new Exercise2() ;
		e2.message();
	}
	
}
