import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Receptioniest extends Employee {

	Ticket tt= new Ticket();
	MultiTimeTicket mul = new MultiTimeTicket();

	Receptioniest(String name, int ID, Date dateofbirth) {
		super(name, ID, dateofbirth);
	}
	
	
	
	 ArrayList<Languages> RecLang = new ArrayList <Languages >();
	 ArrayList<MuseumWorkingDays> RecWD = new ArrayList <MuseumWorkingDays >();
	 ArrayList<Ticket> tick = new ArrayList <Ticket >();

	
	
ArrayList<Visitor> del=new ArrayList<Visitor>();
ArrayList<Visitor> edit=new ArrayList<Visitor>();




private  MuseumSystem m = new MuseumSystem();	


 public Receptioniest(MuseumSystem m ) throws ParseException {	 
	 this.m=m;
	 //m.ListedVisitors();
	//m.getVisitors();

	}
 

 public Receptioniest() throws ParseException {
	// TODO Auto-generated constructor stub
}


Scanner in= new Scanner(System.in);
 
public void registersubs() throws ParseException
 {
	
	System.out.println("Register Visitor: ");

    m.AddAVisitor();

    

 }

   Ticket t = new Ticket(  );
	
	Guide g= new Guide();
	// RegularVisitor R = new RegularVisitor();
VisitorRecord c = new VisitorRecord();
	
	
 public void issueTicket() throws ParseException {
	  	MultiTimeTicket mlt = new MultiTimeTicket();

	boolean founde = false;
	
	 int vID;
	 String holder ;
	 Visitor temp1 = new RegularVisitor();
	 Visitor temp = new RegularVisitor() ;
m.getVisitors();
	 System.out.println("Follow these steps to Issue a Ticket: ");
	 System.out.println("Enter Visitor ID");
	 vID=in.nextInt();
	 
	for(Visitor v:  m.ListedVisitors ) {
		 if(v.getvID()==vID) {
			 founde=true;
			  temp1 = v;
			v.SetVisits_count(v.getVisits_count()+1);
			System.out.println(v);
			 
		if(v.getAge()  ) {
			
		    	temp = new SeniorVisitor();
				break;
		}
		    	else {
				temp = new RegularVisitor();
				break;}
		 } 
	}
	 if (!founde) {
			System.out.println (" No visitor with this enterd ID ,if you are a new visitor, first you should rigester in our system ");
			return;
	 }
	 

		
	System.out.println("Do you have a valid Multi Time previous ticket?  answer just should be: yes/no");
	 int f1;
	  String Y1= "yes";
	  String N1="no";
	  
	  
	  // no 
	  String s1 = in.next();
      if(s1.equalsIgnoreCase(N1)) {

     System.out.println(" Witch type of ticket you want? \n"+
        "1.One time Ticket -When you leave the museum, you will not be able to enter again, and you will need to book a new ticket.\n"
         +"2. Multi time Ticket -You will be able to enter and exit the museum as you want without restrictions, during the day.");			 

		
int choice;
choice=in.nextInt();
String Y2= "yes";
String N2="no";
m.getVisitors();

switch(choice) {

case 1:	  // one time ticket 
	OneTimeTicket ot=  new OneTimeTicket();
	System.out.println("One Time Ticket ");

	int price ;
	
	System.out.println("Enter price ");
	price = in.nextInt();
	ot.setPrice(price);
		
	 	Date tourDate;
		ot.setVisitor(temp1);
		
		
		System.out.println("Enter the date of tour ");
		 String dateFormat ="dd/MM/yyyy"; 
			Scanner indate = new Scanner (System.in);
			tourDate = (new SimpleDateFormat(dateFormat).parse(indate.nextLine()));	
	
		ot.setIssueDate(tourDate );
		ot.setPrice(price);
		temp.bookTour(tourDate , ot.getPrice() );
	      tick.add(mlt);


		  break;
		  
			  
case 2:

	System.out.println("2.Multi Time Ticket 1.Daily 2.monthly 3.yearly ");
	int chT;
	chT=in.nextInt();
	switch (chT) {
	
	case 1: //daily
				Date tourDatel;
			mlt.setVisitor(temp1);
				System.out.println("Enter the date of tour ");
				 String dateFormatl ="dd/MM/yyyy"; 
				Scanner indatel = new Scanner (System.in);
				tourDatel = (new SimpleDateFormat(dateFormatl).parse(indatel.nextLine()));	
				price = tt.getPrice();
				mlt.setPrice(price);
				temp.bookTour(tourDatel , mlt.getPrice() );
			      tick.add(mlt);

	break;
	
		 
		
	
	  case 2: //monthly 
	   
		Date tourDatem;
		mlt.setVisitor(temp1);
		System.out.println("Enter the date of tour ");
		 String dateFormatm ="dd/MM/yyyy"; 
	   	Scanner indatem = new Scanner (System.in);
		tourDatem = (new SimpleDateFormat(dateFormatm).parse(indatem.nextLine()));	
	price = tt.getPrice();
	mlt.setPrice(price);
	temp.bookTour(tourDatem , mlt.getPrice() );
    tick.add(mlt);

		break;
		  
	     
	
	case 3: //yearly
		
		Date tourDatey;
		mlt.setVisitor(temp1);
		System.out.println("Enter the date of tour ");
		 String dateFormaty ="dd/MM/yyyy"; 
			Scanner indatey = new Scanner (System.in);
			tourDatey = (new SimpleDateFormat(dateFormaty).parse(indatey.nextLine()));	
			price = tt.getPrice();
			mlt.setPrice(price);
			temp.bookTour(tourDatey , mlt.getPrice() );
		      tick.add(mlt);

			break;
	
			   }
	
}

      }
 

			// i have an old ticket ! >> check if its valid
			  
		  else if (s1.equalsIgnoreCase(Y1)) {
   			 // System.out.println(" What is the type of ticket: 1.Daily 2.monthly 3.yearly? ");
   			mlt.ValidationTicket();

		  }
      
      
 }

 
 
 
 public void deleteSubs() throws ParseException {
	 int vID;
	boolean found=false;
	//m.ListedVisitors();
		del= m.getVisitors();
	    System.out.println("Enter Visitor ID to Delete his Subs");
	    vID=in.nextInt();
	    
	    
	  for(Visitor v:  m.ListedVisitors  ) {
		  
		 if(v.getvID()==vID) {
		    found=true;
	       del.remove(v);
	      // System.out.println(v);
	     //  m.setVisitors(del);
			return;
		 }
	  } 
	  
	  if(!found)
			 System.out.println("this vistior ID is not in the list ");
			
	 }
 
 
 
 public void editSubs() throws ParseException {
	 
		 int ID;
	boolean found=false;
		m.getVisitors();
		 System.out.println("Enter Personal ID to Edit his Subs");
	    ID=in.nextInt();
	    
	    
	  for(Visitor v:  m.ListedVisitors  ) {
		  
		 if(v.getID()==ID) {
			 found=true;
	       System.out.println(v);
	     //  m.setVisitors(del);
		   //m.ListedVisitors();
		 //  Visitor v = new Visitor();
	       
		     int choice,id,newID;
		     String name;
		     
		     System.out.println("Edit Name  ");
		     
		     String N= "Name";
		  
		  
		    	 System.out.println("Enter new  name");
		    	name=in.next();
		    	v.setName(name);
		    	System.out.println(v);
		    	//m.ListedVisitors
		   		      
		     }
		 
	  } 
		 
	  
	  if(!found)
			 System.out.println("this Personal ID is not in the list ");
			
	 
		 	
	 }
 
 public void main(String[]args) throws ParseException {
	 

		MuseumSystem m = new MuseumSystem();
		Receptioniest r = new Receptioniest(m);
		
	 m.getVisitors();
	 r.deleteSubs();
 }
 
	 
	 }
 

