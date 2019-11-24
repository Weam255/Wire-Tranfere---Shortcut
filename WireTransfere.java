
public class WireTransfere {
	Sender sander;
	Reciver reciver;
	
	double amount;
	Currency currency;
	double fees;
	public WireTransfere() {
		// TODO Auto-generated constructor stub
	}
	public Sender getSander() {
		return sander;
	}
	public void setSander(Sender sander) {
		this.sander = sander;
	}
	public Reciver getReciver() {
		return reciver;
	}
	public void setReciver(Reciver reciver) {
		this.reciver = reciver;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	

}
