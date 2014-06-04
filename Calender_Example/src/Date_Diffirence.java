import java.util.Calendar;

import javax.swing.JOptionPane;


public class Date_Diffirence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Calendar ca1 = Calendar.getInstance();
	        Calendar ca2 = Calendar.getInstance();
	        // Set the date for both of the calendar to get difference
	        ca1.set(1980,2,20);
	        ca2.set(2014, 2, 25);

	        // Get date in milliseconds
	        long milisecond1 = ca1.getTimeInMillis();
	        long milisecond2 = ca2.getTimeInMillis();

	        // Find date difference in milliseconds
	        long diffInMSec = milisecond2 - milisecond1;

	        // Find date difference in days 
	        // (24 hours 60 minutes 60 seconds 1000 millisecond)
	        long diffOfDays = diffInMSec / (24 * 60 * 60 * 1000);

	        System.out.println("Date Difference in : " + diffOfDays + " days.");

	}

}
