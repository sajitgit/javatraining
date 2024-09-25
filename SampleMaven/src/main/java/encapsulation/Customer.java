package encapsulation;

public class Customer{
	

	public int getBankbalance() {
		return bankbalance;
	}
	public void setBankbalance(int bankbalance) {
		this.bankbalance = bankbalance;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	
	private int bankbalance;
	private long accountnumber;

}
