import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class Guide extends Employee {

	int toursnum;
	int price;
Guide(String name, int ID, Date dateofbirth) {
		super(name, ID, dateofbirth);
		
	}

Guide(){
	
}
/*String L;
Guide(String name, int ID, Date dateofbirth,int toursnum,int Employment_id,Date hiredate, String L ){
	this.name=name;
	this.ID=ID;
	this.dateofbirth=dateofbirth;
	this.toursnum=toursnum;
	this.Employment_id=Employment_id;
	this.hireDate=hiredate;   
	this.L=L;
	//this.days=days;
	
}*/

 ArrayList<Languages> Guidelang = new ArrayList <Languages >();
 ArrayList<MuseumWorkingDays> GuideDays = new ArrayList <MuseumWorkingDays >();

ArrayList < Languages > Guidelang   () {
	  
	  for (Languages L : Languages.values()) {
			System.out.println(L);
		}
	  
	return Guidelang;
}



ArrayList<MuseumWorkingDays> GuideDays(){
	
	for (MuseumWorkingDays W : MuseumWorkingDays.values()) {
		System.out.println(W);
	}
	
	return GuideDays;
	
}

 

Guide(String name, int ID, Date dateofbirth,int toursnum,int Employment_id,Date hiredate, ArrayList <Languages> Guidelang , ArrayList <MuseumWorkingDays> GuideDays ){
	this.name=name;
	this.ID=ID;
	this.dateofbirth=dateofbirth;
	this.toursnum=toursnum;
	this.Employment_id=Employment_id;
	this.hireDate=hiredate;
	this.Guidelang=Guidelang;
	this.GuideDays=GuideDays;
	
}


 
 public  void setLanguage ( ArrayList <Languages> Guidelang) { 

 this.Guidelang=Guidelang;
 }
 
 
	public  ArrayList <Languages> getLanguage() {
		
		return Guidelang;	
	}
	
	
	
    public void setToursPerDay(int toursnum) {
		this.toursnum=toursnum;
	}
	
	public int getToursPerDay() {
		return toursnum;
		
	}
	
	public void setworkingdays( ArrayList<MuseumWorkingDays> GuideDays) {
		this.GuideDays=GuideDays;

	}
	
	public ArrayList<MuseumWorkingDays> getworkingdays(){
		return GuideDays;
	
	}
	
	
	public void setguideprice(int price) {
		this.price=price;
	}
	
	public int getguideprice() {
		 return price;
	}
	
	public String toString() {
		 SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");

		return ("GuideName:"+this.getName()+
	             " Guide ID: "+ this.getID() +
	            " DateofBirth: "+ dateForm.format(getdate()) + 
	            " Guide Languages: " + this.getLanguage()+
	            " Tours per day: "+ this.getToursPerDay()+
	             "Guide EmploymentID: "+ this.createEmplymentID()+
	             "Guide HireDate: "+ dateForm.format(getHireDate()) +
	             "Guide Available Days: "+ this.getworkingdays() );		
	}
	
	
}
