import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.*;

public class VisitorRecord {

	Date EnterDate ;
	Date EnterTime ;
	
	
	public void setEnteringDate( Date EnterDate) {
		this.EnterDate=EnterDate;
	}
	
	public Date getEntringDate() throws ParseException {
		
		return EnterDate;
		
		/* String dateFormat ="dd/MM/yyyy"; 
			Scanner indate = new Scanner (System.in);
			return EnterDate = (new SimpleDateFormat(dateFormat).parse(indate.nextLine()));	
	*/
	}
	
	
	public void setEnteringTime( Date EnterTime) {
		this.EnterTime=EnterTime;
	}
	
	public Date getEntringTime() throws ParseException {
	
		return EnterTime;
		 
		/*String dateFormat ="HH:mm"; 
			Scanner indate = new Scanner (System.in);
			return EnterTime = (new SimpleDateFormat(dateFormat).parse(indate.nextLine()));	
		*/
		}
	
	public String toString () {
		SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");
		 SimpleDateFormat timeForm=new SimpleDateFormat("HH:mm");

		
		return (" EntiringDate " + dateForm.format(EnterDate) + " Time: " + timeForm.format(EnterTime) ); 
		
	}
	
	
	
/*	
	public static void main(String [] args) throws ParseException {
		VisitorRecord v = new VisitorRecord();
		System.out.println("Enter Date");
		Date d ;
		Scanner in= new Scanner(System.in);

		VisitorRecord oo = new VisitorRecord();
		oo.	getEntringDate();
		
		
		System.out.println("Enter Time");
	
}
*/
}
