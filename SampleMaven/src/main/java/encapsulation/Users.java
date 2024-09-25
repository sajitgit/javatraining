package encapsulation;

public class Users {
	
	boolean flag = false;


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm obj1 = new Atm();
		obj1.setPin(1001);
		obj1.getPin();
		obj1.validate();
	}

}
