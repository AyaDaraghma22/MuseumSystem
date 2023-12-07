import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class MuseumSystem  {
	
	String HiredEmployees,SubsecribedVisitors;
	String MuseumName,MusuemAdress; 
	int MuseumID, MuseumPhone ;
	String MuseunDiscription;

	 
	MuseumSystem(  ) {
		
	}
	
	public  void MuseumInfo() {
	System.out.println ("Museum Name Malovo Museum" );
	System.out.println ("Musuem Adress Paris, France" ); 
	System.out.println ("Museum ID 90008765");
	System.out.println ("Museum Phone 2344208") ;
	System.out.println ("Museun Discription loream100 ");
	}
	
	
	Scanner in = new Scanner (System.in);

	
	   ArrayList <Ticket> ticket = new ArrayList<Ticket>();

	
	// Array list of visitors
	   ArrayList <Visitor> ListedVisitors = new ArrayList<Visitor>();
	   ArrayList <VisitorRecord> VR = new ArrayList<VisitorRecord>();
	   ArrayList <VisitorRecord> VR2 = new ArrayList<VisitorRecord>();
	   ArrayList <Ticket> tick = new ArrayList<Ticket>();

	  
	 
	/*   ArrayList <Visitor> ListedVisitors( ) throws ParseException {
		  
		  
		   
		//   Visitor v =new Visitor();
		  // v.VisitorRecord();
		   
		  String sDate1="31/12/1998"; 
		  Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		  
		  String sDate2="22/2/1988"; 
		  Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);
		  //System.out.println(sDate2+"\t"+date2);
		   
		  //System.out.println(sDate1+ "\t" +date1);
		final int r1ID=101000;
		final int r2ID=101001;
		
   VisitorRecord v1Records1 = new VisitorRecord();
   VisitorRecord v1Records2 = new VisitorRecord();
   VisitorRecord v1Records3 = new VisitorRecord();
   VisitorRecord v1Records4 = new VisitorRecord();


   VisitorRecord v2Records1 = new VisitorRecord();
   VisitorRecord v2Records2 = new VisitorRecord();


      String vrDate1="31/12/2020"; 
	  Date vrdate1=new SimpleDateFormat("dd/MM/yyyy").parse(vrDate1);
	  v1Records1.setEnteringDate(vrdate1 );

	  String vr1Time1 ="12:00"; 
   	  Date vrtime1 = new SimpleDateFormat("HH:mm").parse(vr1Time1);	
	  v1Records1.setEnteringTime(vrtime1 );

	  
	  String vrDate2="17/1/2021"; 
	  Date vrdate2=new SimpleDateFormat("dd/MM/yyyy").parse(vrDate2);
	  v1Records2.setEnteringDate(vrdate2 );

	  String vr1Time2 ="10:00"; 
   	Date vrtime2 = new SimpleDateFormat("HH:mm").parse(vr1Time2);	
	  v1Records2.setEnteringTime(vrtime2);

	  
	  String vrDate3="22/2/2021"; 
	  Date vrdate3=new SimpleDateFormat("dd/MM/yyyy").parse(vrDate3);
	  v1Records3.setEnteringDate(vrdate3 );

	  String vr1Time3 ="1:00"; 
   	Date vrtime3 = new SimpleDateFormat("HH:mm").parse(vr1Time3);	
	  v1Records3.setEnteringTime(vrtime3);

	  
	  String vrDate4="22/3/2021"; 
	  Date vrdate4=new SimpleDateFormat("dd/MM/yyyy").parse(vrDate4);
	  v1Records4.setEnteringDate(vrdate4 );

	  String vr1Time4 ="2:00"; 
   	Date vrtime4 = new SimpleDateFormat("HH:mm").parse(vr1Time4);	
	  v1Records4.setEnteringTime(vrtime4);

	  VR.add(v1Records1);
	  VR.add(v1Records2);
	  VR.add(v1Records3);
	  VR.add(v1Records4);



	  
	   String vr2Date1="15/11/2020"; 
		  Date vr2date1=new SimpleDateFormat("dd/MM/yyyy").parse(vr2Date1);
		  v2Records1.setEnteringDate(vrdate1 );

		  String vr2Time1 ="12:00"; 
	   	  Date vr2time1 = new SimpleDateFormat("HH:mm").parse(vr2Time1);	
		  v2Records1.setEnteringTime(vr2time1 );

		  
		  String vr2Date2="17/2/2021"; 
		  Date vr2date2=new SimpleDateFormat("dd/MM/yyyy").parse(vrDate2);
		  v2Records2.setEnteringDate(vr2date2 );

		  
		  String vr2Time2 ="10:00"; 
	   	 Date vr2time2 = new SimpleDateFormat("HH:mm").parse(vr2Time2);
	   	
		  v2Records2.setEnteringTime(vr2time2);
         VR2.add(v2Records1);
         VR2.add(v2Records2);

	  
	

	     ListedVisitors.add(new SeniorVisitor(402,"Ahmad",date1,r1ID,110, 4,VR));
	 
		 ListedVisitors.add(new RegularVisitor(403,"Mazen",date2,r2ID,111,2,VR2));
       
		
		int z= ListedVisitors.size();
         for(int i=0;i<z;i++) {
		  System.out.println(ListedVisitors.get(i));
		  
         }
		 
         return ListedVisitors;

	 } */

      
        
    public  void subscribedVisitors(ArrayList <Visitor>ListedVisitors ) {
     
     	 	int z=	ListedVisitors.size();
     	 	//System.out.println(z);
     	 	
    	        for(int i=0; i<ListedVisitors.size() ;i++) {
    	        	
    	            System.out.println(ListedVisitors.get(i));
    	        }
     	      
    }
      
     static int Record_ID=101002;
      static int Visitor_ID = 112;
      int visits_count;
	public  void  AddAVisitor ( ) throws ParseException{
		//Record_ID=Record_ID++;
		//Visitor_ID++;
		String name;
		int ID;
		Date dateofbirth ;
		Date visitDate;
		Date visitTime;


		System.out.println("enter Personal ID");
		ID = in.nextInt();

		for(Visitor v : ListedVisitors) {

		 if(v.getID()==ID) {
			System.out.println(v);
			System.out.println("this ID was added to the list before");
			return;
	    	}
		}
		
				
		ArrayList<VisitorRecord> Visits_Record= new ArrayList<VisitorRecord> ();
		
		System.out.println("enter visitor name");
		name = in.next();

		
		System.out.println("enter Visitor BirthDate in format dd/MM/yyyy ");
		String fformat="dd/MM/yyyy"; 
	    String dateFormat ="dd/MM/yyyy"; 
		Scanner indate = new Scanner (System.in);
		
		dateofbirth = (new SimpleDateFormat(fformat).parse(indate.nextLine()));

		
		System.out.println("Enter the Visit Date in format dd/MM/yyyy ");
		//String format="dd/MM/yyyy"; 
	    String dateFormatv ="dd/MM/yyyy"; 
		Scanner indatev = new Scanner (System.in);
		
		visitDate = (new SimpleDateFormat(dateFormatv).parse(indate.nextLine()));
		
		VisitorRecord vd = new VisitorRecord();
		vd.setEnteringDate( visitDate);
		vd.getEntringDate();

		System.out.println("Enter the Visit Time in format HH:mm ");
		 String tdateFormat ="HH:mm"; 
		Scanner tindate = new Scanner (System.in);
		 visitTime = (new SimpleDateFormat(tdateFormat).parse(tindate.nextLine()));	
		
		vd.setEnteringTime(visitTime);
		vd.getEntringDate();
		Visits_Record.add(vd);
	 
		
		//visits_count++;
		Record_ID++;
		Visitor_ID++;

 	    ListedVisitors.add(new RegularVisitor(ID,name,dateofbirth, Record_ID ,  Visitor_ID , visits_count  , Visits_Record )); 
 		 

 	    /*int z=	ListedVisitors.size();
 	 	System.out.println(z);
 	 	
	        for(int i=0; i<ListedVisitors.size() ; i++) {
	        	
	            System.out.println(ListedVisitors.get(i));
	            
	            }	  */     
				
	}

	
	public void setVisitors(ArrayList <Visitor> ListedVisitors) {
  	  
  	  this.ListedVisitors=ListedVisitors ;
  	  
      }
	

	public  ArrayList  <Visitor> getVisitors()  {
		
	/*	int z=ListedVisitors.size();
		System.out.println(z);
		
		for(int i=0;i<z;i++){
 		  System.out.println(ListedVisitors.get(i));
 		}*/
			return ListedVisitors;

	}
	
/*	public void listofEmployees() throws ParseException {
		SubGuides();
		
		// list of Guides
		// list of recep.
	}*/
	
	
	public void HiredEmployees() {
		
		System.out.println("List of Hired Employees");
//		System.out.println("Name ")
		
	}
	
 


	public void SubRec( ArrayList<Receptioniest> Rec ) {
		
		int z=  Rec.size();
		for (int i=0;i<z;i++) {
			System.out.println(Rec.get(i));
		}
	}
	
	  ArrayList <Guide> ListedGuides =new ArrayList <Guide> ();
	  ArrayList <MuseumWorkingDays> GuideWD =new ArrayList <MuseumWorkingDays> ();
		
		
		
	public  ArrayList <Guide> ListedGuides () throws ParseException {
	  
		  ArrayList<Languages> Guidelang1 = new ArrayList <Languages >();
		  ArrayList<Languages> Guidelang2 = new ArrayList <Languages >();

		  ArrayList<MuseumWorkingDays> GuideDays1 = new ArrayList <MuseumWorkingDays> ();
		  ArrayList<MuseumWorkingDays> GuideDays2 = new ArrayList <MuseumWorkingDays> ();

		
		  String gDate1="27/12/1995"; 
		  Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(gDate1);
		  
		  String hDate1="27/12/2010"; 
		  Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(hDate1);
		 
		  String gDate2="7/7/1993"; 
		  Date date3=new SimpleDateFormat("dd/MM/yyyy").parse(gDate2);
		  
		  String hDate2="5/12/2011"; 
		  Date date4=new SimpleDateFormat("dd/MM/yyyy").parse(hDate2);
		  
			String langname = "Arabic";	 
			String workday = "Saturday";
			
			String langname2 = "English";	 
			String workday2 = "Sunday";
			
			String langname3 = "Franch";	
			
			String workday3 = "Monday";
			String workday4 = "Tusday";
			String workday5 = "Wednesday";
			String workday6 = "Thursday";
			String workday7 = "Friday";
 

			
			
	       
	       Languages LN = Languages.valueOf(langname);
	       Languages LN1 = Languages.valueOf(langname2);
	       Guidelang1.add(LN);
	       Guidelang1.add(LN1);
	       

	       MuseumWorkingDays DW1 = MuseumWorkingDays.valueOf(workday);
	       GuideDays1.add(DW1);
	       
	       MuseumWorkingDays DW2 = MuseumWorkingDays.valueOf(workday2);
	       GuideDays1.add(DW2);
	       
	       
	       Languages LN2 = Languages.valueOf(langname);
	       Guidelang2.add(LN2);
	       
	       Languages LN3 = Languages.valueOf(langname2);
	       Guidelang2.add(LN3);
	       
	       Languages LN4 = Languages.valueOf(langname3);
	       Guidelang2.add(LN4);

	       

	       MuseumWorkingDays DW3 = MuseumWorkingDays.valueOf(workday);
	       GuideDays2.add(DW1);
	       
	       MuseumWorkingDays DW4 = MuseumWorkingDays.valueOf(workday2);
	       GuideDays2.add(DW4);
	       

	       MuseumWorkingDays DW5 = MuseumWorkingDays.valueOf(workday3);
	       GuideDays2.add(DW5);
	       
	       
	       MuseumWorkingDays DW6 = MuseumWorkingDays.valueOf(workday4);
	       GuideDays2.add(DW6);
	       

	       MuseumWorkingDays DW7 = MuseumWorkingDays.valueOf(workday5);
	       GuideDays2.add(DW7);

	       MuseumWorkingDays DW8 = MuseumWorkingDays.valueOf(workday6);
	       GuideDays2.add(DW8);

	       MuseumWorkingDays DW9 = MuseumWorkingDays.valueOf(workday7);
	       GuideDays2.add(DW9);
	       
	       
		  ListedGuides.add(new Guide( "Jad", 12251 , date1 , 3 ,110101, date2,Guidelang1 ,GuideDays1 ));
		  ListedGuides.add(new Guide( "Eyad", 13361 , date3 , 2 ,110102, date4,Guidelang2, GuideDays2));

		
		/*int z=ListedGuides.size();
		System.out.println(z);
		for(int i=0 ; i<z;i++) {
			System.out.println(ListedGuides.get(i) );
		}*/
	
		return ListedGuides;
		
	}
	

	int employment_id=110103;
	
	public  void AddGuide(  ) throws ParseException {
		employment_id= (employment_id)++;

		//ArrayList <Guide>  guide= new ArrayList <Guide>();

		  ArrayList<Languages> Guidelang = new ArrayList <Languages >();
		  ArrayList<MuseumWorkingDays> GuideDays = new ArrayList <MuseumWorkingDays >();
		
		String name;
	    int ID;
		int L;
		//int  EmpID =120; 
		String langname;
		Date dateofbirth;
		
		Scanner in = new Scanner (System.in);
 		System.out.println("enter Guide name");
		name = in.next();
		
		System.out.println("enter Guide ID");
		ID = in.nextInt();

		System.out.println("enter Guide Date in format dd/MM/yyyy ");
	
	    String dateFormat ="dd/MM/yyyy"; 
		Scanner indate = new Scanner (System.in);

		dateofbirth = (new SimpleDateFormat(dateFormat).parse(indate.nextLine()));
 	    
		System.out.println(" Guide HireDate in format dd/MM/yyyy is ");
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date dateofhire = new Date();  
	    System.out.println(formatter.format(dateofhire));  
	  
		
		//Date dateofhire= new Date();
        //System.out.println("You were hired in: "+dateofhire );
 
 	    		 
		System.out.println("Museum Working days: ");
		for (MuseumWorkingDays Days : MuseumWorkingDays.values()) {
			System.out.println(Days);
		}
		
		int q,Tnum;
	     String dchoice;
		System.out.println("enter number of days you will work in ");
		q=in.nextInt();
		System.out.println("Days Names: ");
		
		
		for(int i=0 ; i<q ;i++) {
			
		       dchoice = in.next();	 
		       
		       MuseumWorkingDays d = MuseumWorkingDays.valueOf(dchoice);
		     GuideDays.add(d);
		       }
		
		for(int i=0;i<q;i++) {
			System.out.println( GuideDays.get(i) );
		}
	
		
		System.out.println("enter num of Guide tours per day");
		Tnum=in.nextInt();
		
		System.out.println("Enter number of languages U speak");
		L=in.nextInt();

		System.out.println("Enter Name of languages U speak to add them to your Guide info. ");
		for(int i=0 ; i<L ;i++) {
			
		       langname = in.next();	 
		       
		       Languages LN = Languages.valueOf(langname);
		       Guidelang.add(LN);

		}
		
		for(int i=0;i<L;i++) {
			System.out.println( Guidelang.get(i));
		}
		   
		
		
		ListedGuides.add(new Guide(  name,  ID,  dateofbirth, Tnum  , employment_id  , dateofhire ,  Guidelang ,  GuideDays ));
		
		int z= ListedGuides.size();
		System.out.println(z);
		for(int i =0 ; i<z ; i++) {
			System.out.println(ListedGuides.get(i));

		}
	}
			
	public  void SubGuides(  ArrayList <Guide> ListedGuides) {
	     
 	 	int z=	ListedGuides.size();
 	 	System.out.println(z);
 	 	
	        for(int i=0; i<ListedGuides.size() ;i++) {
	        	
	            System.out.println(ListedGuides.get(i));
	        }
 	      
 }
	
	
	public  void setGuides(ArrayList<Guide> ListedGuides ) { 
		int z= ListedGuides.size();
		
	System.out.println(z);
		this.ListedGuides=ListedGuides;
		
	}
	
	
	
	public  ArrayList<Guide> getGuides(){
		
		int z= ListedGuides.size();
		System.out.println(z);
		
		return ListedGuides;
		
	}
	
	



	public  ArrayList<Guide> getAvilableGuides( Date availbalein ) throws ParseException {
		
		ArrayList <Guide>  AvailableG= new ArrayList <Guide>();
		 boolean found=false;

		/*
		 System.out.println("Enter date");
	Date d;
	 String dateFormat ="dd/MM/yyyy"; 
		Scanner indate = new Scanner (System.in);

		d = (new SimpleDateFormat(dateFormat).parse(indate.nextLine()));
		 */ 
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", java.util.Locale.ENGLISH);
		sdf.applyPattern("EEEE");
		String sMyDate = sdf.format(availbalein);
		System.out.println(sMyDate);
	
		
		
		
		System.out.println("Enter Visitor Language: ");
		String vlangname;
		vlangname=in.next();
		
		

		for (Guide g :ListedGuides ) {
 
			 for( MuseumWorkingDays WD : g.getworkingdays() ) {

				 String s = WD.name();
			
				if( sMyDate.equalsIgnoreCase(s)) {
					found = true;
					//System.out.println(g);
					
				for( Languages Ln : g.getLanguage() ) {
						
					    Languages LV = Languages.valueOf(vlangname);

						 String n =Ln.name();
					if (vlangname.equalsIgnoreCase(n)) {
						System.out.println(g);
						 found = true;
							//System.out.println("Guide in that day with suitable language: ");
						 AvailableG.add(g);
				}
			}
					
		}
	}
		}
		
		return AvailableG;

		
	}
		
}
		

	
/*
public 

 void main(String [] args) throws ParseException  {
	
	MuseumSystem m = new MuseumSystem();
  m.ListedGuides();
System.out.println("___");
	
	Date d;
	 String dateFormat ="dd/MM/yyyy"; 
		Scanner indate = new Scanner (System.in);

	d = (new SimpleDateFormat(dateFormat).parse(indate.nextLine()));
	
	m.getAvilableGuides(d);

}
}
	

*/







