import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MultiTimeTicket extends Ticket {
	
	ArrayList<TicketType> typroftick = new 	ArrayList<TicketType>();
	
	MultiTimeTicket(int Ticket_ID,int vID,int price ,Date issue_Date,String holder ){

		super(Ticket_ID, vID, issue_Date,holder);

	}
	MultiTimeTicket(){
		
	}
	
	
	Scanner in=new Scanner(System.in);
	String Ticket_type;
	
	
	
public ArrayList<TicketType> getTicketType( ) {
	
	System.out.println("Get ticket type: ");
	
	return typroftick;
	
	
}
	
	public boolean ValidationTicket() throws ParseException {
		
		System.out.println(" Select your ticket type: DAILY, MONTHLY or YEARLY");
		Ticket_type= in.next();
		
		TicketType T =  TicketType.valueOf(Ticket_type);
		String s = T.name();
		
		
		if(s=="DAILY") 	{
			  
				//Daily
					  
					  System.out.println(" You can Enter and leave the museum During Day of Issued the Ticket ");
					  
					  System.out.println("enter Issue Date of the Ticket in format dd/MM/yyyy ");
						
					  Date Issueday;
					  
					  String fformat="dd/MM/yyyy"; 
					  Scanner indate = new Scanner (System.in);
						
					    Issueday = (new SimpleDateFormat(fformat).parse(indate.nextLine()));
					    String dateI = new SimpleDateFormat("dd-MM-yyyy").format( Issueday);

							

					    Date issue_Datee = new Date();  
					    String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
					 	 
					    
					 int q= date.compareTo(dateI);
					 
				     //System.out.println(q);
					 
				     if(q==0) {
				    	 System.out.println("Yor Daily Ticket is Valid");
				    	 return true;
				     }
				     else {
				    	 System.out.println("Yor Daily Ticket is NOT Valid");
				    	 	return false;
				     }
			
			
			
		}
		
		
		else if (s=="MONTHLY") {
			  // monthly
			  
			  
			  System.out.println("Enter Issued Date of your ticket: " );
			  Date IssuedD;

		String dateFormat ="dd/MM/yyyy"; 
			Scanner indate2 = new Scanner (System.in);
			 IssuedD = (new SimpleDateFormat(dateFormat).parse(indate2.nextLine()));
			
			 Calendar cal = Calendar.getInstance();
		      cal.setTime(IssuedD);
		      cal.add(Calendar.MONTH, 1);
		      cal.getTime();

		       SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		      String dateE = format1.format(cal.getTime()); 

		      System.out.println( dateE );
		      
		// ??    dateE > Date 
			   Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(dateE);  
			   // System.out.println( dateE +"\t"+date1);  

		      
		// dates between issued and date1 
		      
		      SimpleDateFormat Cformate = new SimpleDateFormat("dd/MM/yyyy");  
			    Date Currdate = new Date();  
			    System.out.println(Cformate.format(Currdate));  
			
			   
		      
		      System.out.println("Ensure that the current date is within the monthly ticket date ");

		     // if(!(Currdate.before(IssuedD) || Currdate.after(date1)))
		    	  
		   if(( Currdate.after(IssuedD)) && (Currdate.before(date1))) {
		   System.out.println("your Tikect is valid ");
		   return true;
		   }
		  else {
		  	System.out.println("You have to issued a new ticket, cuz your monthly subscription has expired");
		  return false;
		  }

			
		}
		
		else if (s=="YEARLY") {
				  System.out.println("Enter Issued Date of your ticket");
			  
			  Date IssuedY;

				String dateFormate1 ="dd/MM/yyyy"; 
					Scanner indatee = new Scanner (System.in);
					 IssuedY = (new SimpleDateFormat(dateFormate1).parse(indatee.nextLine()));
					
					 Calendar caly = Calendar.getInstance();
				      caly.setTime(IssuedY);
				      caly.add(Calendar.YEAR, 1);
				      caly.getTime();

				       SimpleDateFormat formatt = new SimpleDateFormat("dd/MM/yyyy");
				      String datey = formatt.format(caly.getTime()); 

				      System.out.println( datey );
				      
				// ??    dateE > Date 
					   Date datee=new SimpleDateFormat("dd/MM/yyyy").parse(datey);  
					   // System.out.println( dateE +"\t"+date1);  

				      
				// dates between issued and date1 
				      
				      SimpleDateFormat Cyformate = new SimpleDateFormat("dd/MM/yyyy");  
					    Date Currydate = new Date();  
					    System.out.println(Cyformate.format(Currydate));  
					
					   
				      
				      System.out.println("Ensure that the current date is within the Yearly ticket date ");

				     // if(!(Currdate.before(IssuedD) || Currdate.after(date1)))
				    	  
				   if(( Currydate.after(IssuedY)) && (Currydate.before(datee))) { 
			   System.out.println("your Tikect is valid ");

				   }
				  else {
				  	System.out.println("You have to issued a new ticket, cuz your yearly subscription has expired");
					return false;

				  }
		}
		return false;
	}
	
	
	public static void main(String[]args) throws ParseException {
		
		MultiTimeTicket m = new MultiTimeTicket();
		m.getTicketType();	
	}
}
