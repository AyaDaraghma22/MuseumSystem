
public enum TicketType {

	DAILY(100),MONTHLY(200),YEARLY(300);

	private int price;
	TicketType(int i) {
		this.price = i;
	}
	
	public int getprice() {
		return price;
	}
	
}
