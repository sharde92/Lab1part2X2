import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class lab1part2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
		//user inputs start date
        System.out.println("Enter start date in dd-MM-yyyy/HH:mm:ss format :");
         
        String s1 = sc.next();
        
        //user inputs end date
        System.out.println("Enter end date in dd-MM-yyyy/HH:mm:ss format :");
         
        String s2 = sc.next();
        
        //format used for time entry
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy/HH:mm:ss");
       
        //conversion methods for dates and time entered
        try
        {
            Date startDate = formatter.parse(s1);
             
            Date endDate = formatter.parse(s2);
             
            long diffInMilliSec = endDate.getTime() - startDate.getTime();
             
            long seconds = (diffInMilliSec / 1000) % 60;
             
            long minutes = (diffInMilliSec / (1000 * 60)) % 60;
             
            long hours = (diffInMilliSec / (1000 * 60 * 60)) % 24;
             
            long days = (diffInMilliSec / (1000 * 60 * 60 * 24)) % 365;
            
            long months = (long) (diffInMilliSec / (60 * 60 * 1000 * 24 * 30.41666666));
             
            long years =  (diffInMilliSec / (1000l * 60 * 60 * 24 * 365));
             
            //Given Date and time difference output
            System.out.println("Difference is ---> ");
             
            System.out.println(years+" years, "+months+" months,+ "+days+" days, "+hours+" hours, "+minutes+" minutes, "+seconds+" seconds");
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
         
        sc.close();
		
	}
		
		
}

