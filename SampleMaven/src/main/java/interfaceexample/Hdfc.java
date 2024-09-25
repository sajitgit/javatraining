package interfaceexample;

public class Hdfc implements RBI {
	
	public void recurringDeposit(int amount,int duration) {
		
		float total = amount +(amount*interestrate*duration);
		
		System.out.println("Amount you will get after"+duration+"years is"+total);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hdfc obj1 = new Hdfc();
		obj1.recurringDeposit(1000, 2);
	}

}
