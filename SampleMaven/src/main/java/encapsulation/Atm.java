package encapsulation;

public class Atm {

	private int pin;
		
	public void setPin(int pin) {
		
		this.pin=pin;
		
	}
		
	public void getPin() {
			
	System.out.println("User entered pin is:"+pin);
			
	}
		
	
	public void validate() {
		
		int count =0;
		int pins[] = {1001,1234,1212};
		
		for(int i =0;i<pins.length;i++) {
			
		
		if(pin==pins[i]) {
		
			count++;
		}
	}
		if(count>0) {
			System.out.println("valid pin");
		}
		
		else {
			System.out.println("Invalid pin");
		}
	}
}
