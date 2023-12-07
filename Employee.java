import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class Employee extends Person{

	Employee(String name, int ID, Date dateofbirth) {
		super(name, ID, dateofbirth);
	}
	
	
	ArrayList <Languages> employeelang = new ArrayList < Languages>();
	ArrayList <MuseumWorkingDays> employeeWD = new ArrayList < MuseumWorkingDays>();

	
protected  int  Employment_id;
	protected Date hireDate;
	
	Employee(){
		this.name=null;
		this.ID=0;
		this.dateofbirth=null;
		this.Employment_id=0;
		this.hireDate=null;
	}
	
	public void setHireDate(Date hireDate) {
		this.hireDate=hireDate;
		
	}
	
public Date getHireDate() {
	return hireDate;
	
}


//private static AtomicLong idCounter = new AtomicLong();


public void setemplymentID(int Employment_id) {
	this.Employment_id=Employment_id;
}


// get empoyeement id 

public  int createEmplymentID()
{
	return Employment_id;
		
   // return String.valueOf(idCounter.getAndIncrement());
}



public  void setLanguage ( ArrayList <Languages> employeelang) { 
this.employeelang=employeelang;
 }


	public  ArrayList <Languages> getLanguage() {
		
		return employeelang ;	
	}
	
	public void setworkingdays( ArrayList<MuseumWorkingDays> employeeWD) {
		this.employeeWD=employeeWD;

	}
	
	public ArrayList<MuseumWorkingDays> getworkingdays(){
		return employeeWD;
	
	}
	

public String toString() {
	 SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");

	 return ("Emolyee Name:"+this.getName()+
             " Employee ID : "+ this.getID() +
            " DateofBirth: "+ dateForm.format(getdate()	) + 
            " Employment ID: " + this.createEmplymentID()+
            " Eployee HireDate: "+ dateForm.format(getHireDate())+
            " Works in Days:  " + this.getworkingdays() +
            " Languages: " + this.getLanguage()
    		);	
}

	
}
