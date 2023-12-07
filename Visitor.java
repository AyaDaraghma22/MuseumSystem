import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

abstract  class  Visitor extends  Person {
	
	int visits_count;
	 int record_id;
     int vID;	
	
	Visitor(String name, int ID, Date dateofbirth) {
		super(name, ID, dateofbirth);

	}
	
	
	Visitor(){
		this.name=null;
		this.ID=0;
		this.dateofbirth=null;
		this.record_id=0;
		this.visits_count=0;
		
	}

	

	
	
	Visitor( int ID,String name, Date dateofbirth,int record_id , int vID, int visits_count, ArrayList<VisitorRecord> Visits_Record ){
		this.ID=ID;
		this.name=name;
		this.dateofbirth=dateofbirth;
		this.record_id= record_id;
		this.vID=vID;
		this.visits_count=visits_count;
	    this.VR=Visits_Record;
	}
	
	 

	
	 public void setRecord_id(int record_id) {
		this.record_id=record_id;
		
	}
	
	 
	public int getRecord_id() {
		return record_id;
		
	}

	public void SetVisits_count( int visits_count )  {
		this.visits_count=visits_count;
		
	}  
	

	public int  getVisits_count(  ){
		
		return visits_count;
		
	} 
	
	
	public int  getvID() {
		return vID;
	}
	
	
	public void setvID(int vID) {
		this.vID=vID;
	}
	
	 
	
	ArrayList<VisitorRecord> VR = new ArrayList<VisitorRecord>(); 
	
	
	ArrayList<VisitorRecord> VR (){
		
		//System.out.println("Enter date u want to visit the museum: ");
		
		
		
		return VR;
		
	}
	
	public void SetVisits( ArrayList <VisitorRecord> VR)  {
		this.VR=VR;
		
	}	
	
	public ArrayList<VisitorRecord> GetVisits( )  {
		
		 return VR;
	}	
	
	
//Ticket t = new Ticket();
	Scanner in = new Scanner(System.in);
	
public  abstract void bookTour(Date tourDate, int price) throws ParseException;


public boolean getAge() throws ParseException {
	
	
    System.out.println("Enter date of birth in type : yyyy/MM/dd");
    
    String fformat="yyyy/MM/dd"; 
	Scanner indate = new Scanner (System.in);
	
	dateofbirth = (new SimpleDateFormat(fformat).parse(indate.nextLine()));

	 
		  
	  Calendar c = Calendar.getInstance();
	  c.setTime(dateofbirth);
	  int year = c.get(Calendar.YEAR);
	  int month = c.get(Calendar.MONTH) + 1;
	  int date = c.get(Calendar.DATE);
	  LocalDate l1 = LocalDate.of(year, month, date);
	  LocalDate now1 = LocalDate.now();
	  Period diff1 = Period.between(l1, now1);
	  
	  System.out.println("age:" + diff1.getYears() + " years");
	  
	  if (diff1.getYears() > 50 ) {
		  System.out.println("Your a Senior Visitor so you have a dicount");
		  return true;
}
	  
	  else {
		 if (diff1.getYears() < 50)
			  System.out.println("Your a Regular Visitor ");
		 return false;
	  } 
 	
}


/*int choice;
System.out.println("1. want to have a guide in this tour?");
System.out.println("2. no need to have a guide in this tour?");
choice=in.nextInt();
String langname;
switch(choice) {
case 1:
	System.out.println("Enter the Date of your tour:");
	
	Date EntringDate;
		
	 String dateFormat ="dd/MM/yyyy"; 
		Scanner indate = new Scanner (System.in);
		 EntringDate = (new SimpleDateFormat(dateFormat).parse(indate.nextLine()));	
	
		 
	//System.out.println("Enter your language, Our system will choose the right judge for you");
 langname = in.next();	 
       
      Languages LN = Languages.valueOf(langname);
		 
       MuseumSystem m = new MuseumSystem();	 
       m.getAvilableGuides(EntringDate);

}*/


public String toString() {
	
	 SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");
	 //SimpleDateFormat timeForm=new SimpleDateFormat("HH:mm");

	return ("VisitorName:"+this.getName()+
             " Personal ID : "+ this.getID() +
            " DateofBirth: "+  dateForm.format(getdate())+ 
            " Record_ID: " + this.getRecord_id()+
            " Visitor_ID: " + this.getvID()+
            " visits_count: "+ this.getVisits_count()+
            " Visits: "+        this.GetVisits()
			);
}
  
		
	

}
	

