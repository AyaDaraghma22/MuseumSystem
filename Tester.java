import java.text.ParseException;
import java.util.Scanner;

public class Tester {

	MuseumSystem m;
	Receptioniest r ;
	
	Tester (MuseumSystem m , Receptioniest r ) throws ParseException{
		
	this.m=m;
	this.r=r;
	//m.ListedVisitors();
	//m.ListedGuides();
	
	}
	
	public static void main(String [] args ) throws ParseException {
		
		MuseumSystem m = new MuseumSystem();
		Receptioniest r = new Receptioniest(m);
		
		Scanner in= new Scanner (System.in);
		

 		while (true){
 			System.out.println("1. Register Subs  ");
 			System.out.println("2. Issue Tickets ");
 			System.out.println("3. Delte Subs ");
 			System.out.println("4. Edit Subs ");
 			System.out.println("5. Add Guide ");
 			System.out.println("6. Print list of Guides ");
 			System.out.println("7. Print list of Visitors ");
 			System.out.println("8.EXIT");
 			
 			System.out.println("Enter your choise");

		int ch;
		ch = in.nextInt();
		
		
		switch ( ch ) {
		
		case 1:
			
 			r.registersubs();
			break;   
		          
        case 2:
        	
       	 r.issueTicket();
       	 break;
       	 
        case 3:
        	
       	 r.deleteSubs();
       	 break;
       	 
        case 4:
       	 r.editSubs();
       	 break;
       	 
        case 5:
        	m.AddGuide( );
        	break;
        	
        case 6:
        	m.ListedGuides();
        	m.SubGuides(m.ListedGuides );
        	break;
        case 7:
        	m.getVisitors();
        	m.subscribedVisitors( m.ListedVisitors);
        	break;
   
        case 8:
        	System.exit(0);
        	
		}			


 	}
 		
	       
	}
	
		}
	

