package Lab3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Exercise7 {
	
	public void durationTime(String yourDate) {
		
		try {
			LocalDate cur_date = LocalDate.now() ;
			
			//format the date before parsing
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			  
			 //convert String to LocalDate
			LocalDate your_date = LocalDate.parse(yourDate, formatter);
			
			System.out.println("Entered Date : " + your_date);
			
			System.out.println("System Date : " + cur_date);
			
			//period to find the difference that is duration
			Period period = Period.between(your_date , cur_date);
		    
			long diff = Math.abs(period.getDays());
			
			long diff2 = Math.abs(period.getMonths());
			
			long diff3 = Math.abs(period.getYears());
			
			System.out.print(diff + " Day(s) ");
			
			System.out.print(diff2 + " Month(s) " );
			
			System.out.print(diff3 + " Year(s)" );
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Exercise7 e7 = new Exercise7() ;
		
		e7.durationTime("15-08-2022");
		
	}
	}
		
	
	
	

