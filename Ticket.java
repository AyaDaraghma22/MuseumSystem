import java.util.Date;

public class Ticket {
	Date issue_Date;
	int price;
	int Ticket_ID;
	int vID;
	String holder;
	
	 private Visitor v ;
	
	Ticket(Visitor v ){
		this.v=v;
	}
	Ticket(){
		
	}
	
	Ticket(int vID,int price ,Date issue_Date,String holder ){
		this.price=price;
		this.issue_Date = issue_Date;
		this. holder= holder;
		this.vID=vID;
	}
	
	
	public void setIssueDate( Date issue_Date) {
		this.issue_Date=issue_Date;
	}
	
	
	public Date getIssueDate() {
		return issue_Date;
	}
	
	
	public void setVisitor(Visitor v) {
		this.v=v;
	}
	
	
	public Visitor getVisitor() {
		return v;
		
	}
	
	
	public void setPrice(int discountRate) {
		this.price=discountRate;
	}
	
	public int getPrice() {	
		return price;
		
	}
	
	public String toString(){
		return (
				
				"Ticket IssueDate: " + this.getIssueDate()+
				" Visitor: " + this.getVisitor() +
				" Price: "+ this.getPrice()
				
				);
		
	}
	
	
}
