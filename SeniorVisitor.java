import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class SeniorVisitor extends Visitor{
	SeniorVisitor(String name, int ID, Date dateofbirth){
		super(name, ID, dateofbirth);
	}
	
 
	int discountRate;
	int guideprice = 200;

SeniorVisitor( ){
	}

	SeniorVisitor( int ID,String name, Date dateofbirth,int record_id , int vID, int visits_count, ArrayList<VisitorRecord> Visits_Record ){
		this.ID=ID;
		this.name=name;
		this.dateofbirth=dateofbirth;
		this.record_id= record_id;
		this.vID=vID;
		this.visits_count=visits_count;
	    this.VR=Visits_Record;
	}
	
	 
	
	public void setDiscountRate(int discountRate){
		
		this.discountRate= discountRate;
	}
	
	public double getDiscountRate(){
		
		return discountRate;
		
	}
	
       MuseumSystem m = new MuseumSystem();	
	   VisitorRecord vr = new VisitorRecord();
	   VisitorRecord c = new VisitorRecord();
	   MultiTimeTicket ML = new MultiTimeTicket();
	   
	   ArrayList<Ticket> ticketlist =new   ArrayList<Ticket>();
	   
	   Date tourDate;
	
	public void bookTour(Date tourDate , int price) throws ParseException {
		
		int choice;
		System.out.println("1. want to have a guide in this tour?");
		System.out.println("2. no need to have a guide in this tour?");
	choice=in.nextInt();
		String langname;
		
		Visitor temp1;
		
		switch(choice) {
		case 1:
			//with guide
			
				c. setEnteringDate(tourDate);
			//	ML.setDateTicket(tourDate);
				
				Date tourTime;
				 System.out.println("Enter the Time of your tour:");

				 String tdateFormat ="HH:mm"; 
					Scanner tindate = new Scanner (System.in);
					tourTime = (new SimpleDateFormat(tdateFormat).parse(tindate.nextLine()));	
					c. setEnteringTime(tourTime);
				//	ML.setDateTicket(tourTime);
			
			//vr.setEnteringDate(tourDate);
		    //vr.getEntringDate();
			// !!!!!! this get has errors! 
					
           m.ListedGuides();					
					
		    m.getAvilableGuides(tourDate);
		    
		     
		   
		     
		     //price ?? 
		    discountRate = (guideprice+price)-((guideprice+price)*30/100);
		      ML.setPrice(discountRate);
		      System.out.println("Your Tour Price is: "  + discountRate + "$");
		     
		       break;
		       
		       
		     
		case 2:
			// without guide
			System.out.println("Enter the Date of your tour:");

			
			c. setEnteringDate( tourDate);

				System.out.println("Enter the Time of your tour:");

		          Date EntringTime;
				 
				 String tdateFormat1 ="HH:mm"; 
					Scanner tindate1 = new Scanner (System.in);
					 EntringTime = (new SimpleDateFormat(tdateFormat1).parse(tindate1.nextLine()));	
					c. setEnteringTime(EntringTime);
					 
					
		
					discountRate = price - (price * 30 /100) ; 
					ML.setPrice(discountRate);
					 System.out.println("Your Tour Price With Discount 30% is: "+ discountRate  + "$" );
				break;
		
		}
	}
		
		
		
	}
	
