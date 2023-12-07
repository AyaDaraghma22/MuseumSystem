import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class RegularVisitor extends Visitor {
	RegularVisitor(String name, int ID, Date dateofbirth){
		super(name, ID, dateofbirth);
	}
	
	
	int guideprice = 200;
	
	Ticket ti = new Ticket();

	
    MuseumSystem m = new MuseumSystem();	
   // Guide g = new Guide();

	RegularVisitor(MuseumSystem m){
		this.m=m;
	}
	
	RegularVisitor(){
		
	}
	
	RegularVisitor( int ID,String name, Date dateofbirth,int record_id , int vID, int visits_count, ArrayList<VisitorRecord> Visits_Record ){
		this.ID=ID;
		this.name=name;
		this.dateofbirth=dateofbirth;
		this.record_id= record_id;
		this.vID=vID;
		this.visits_count=visits_count;
	    this.VR=Visits_Record;
	}
	
	
	   VisitorRecord vr = new VisitorRecord();
	   VisitorRecord c = new VisitorRecord();
	   OneTimeTicket onT = new OneTimeTicket();

	   Date tourDate;
	
	
	public void bookTour(Date tourDate , int price) throws ParseException {
		int choice;
		System.out.println("1. want to have a guide in this tour?");
		System.out.println("2. no need to have a guide in this tour?");
  choice=in.nextInt();
		String langname;
		switch(choice) {
		case 1:
			//with guide
			
			c. setEnteringDate(tourDate);
				
				Date tourTime;
				 System.out.println("Enter the Time of your tour:");

				 String tdateFormat ="HH:mm"; 
					Scanner tindate = new Scanner (System.in);
					tourTime = (new SimpleDateFormat(tdateFormat).parse(tindate.nextLine()));	
					c. setEnteringTime(tourTime);

			
           m.ListedGuides();					
					
		    m.getAvilableGuides(tourDate);
		    
		    
		    
		     
		     int totprice = guideprice+price;
		      
		       System.out.println("Your Tour Price is: "  + totprice + "$");
		     
		    
		       break;
		     
		case 2:
			// without guide

			c. setEnteringDate(tourDate );
				 
				 System.out.println("Enter the Time of your tour:");

		          Date EntringTime;
				 
				 String tdateFormat1 ="HH:mm"; 
					Scanner tindate1 = new Scanner (System.in);
					 EntringTime = (new SimpleDateFormat(tdateFormat1).parse(tindate1.nextLine()));	
					c. setEnteringTime(EntringTime);


					 System.out.println("Your Tour Price is: "+ price + "$" );
				
		
		}
	}
}
