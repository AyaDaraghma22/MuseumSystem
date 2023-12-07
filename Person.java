import java.util.Arrays;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	String name;
	int ID;
	Date dateofbirth;
	
	
	Person(){
		this.name=null;
		this.ID= 0;
		this.dateofbirth=null;
	}
    
        Person(String name, int ID, Date dateofbirth){
        	this.name=name;
        	this.dateofbirth=dateofbirth;
        	this.ID=ID;
	   }
        
      
        
    	protected  void setdate(Date dateofbirth )  {	
    		    	
    		this.dateofbirth=dateofbirth;	
    	}
    	
    	
	    protected  Date getdate( ) {
		
		return dateofbirth;
		
	    }
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName(){
		return name;
		
	}
	
	
	public void setID(int ID) {
		this.ID=ID;
		
	}
	
	public int getID() {
		return ID;
			
	}
	 

	public String toString()
	{
		
	return String.format("%s, %d, %s Birthdate: %s", name, ID, dateofbirth);
	}
	
}
