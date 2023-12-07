import java.util.Date;

public class OneTimeTicket extends Ticket {

	OneTimeTicket(int Ticket_ID,int vID,int price ,Date issue_Date,String holder ){

		super(Ticket_ID, vID, issue_Date,holder);

	}
	
	OneTimeTicket(){
		
	}
	
	
	/*public void setPrice(double price) {
		this.price=price;
	}
	
	public double getPrice() {
		
		return price;
		
	}*/
	
}
