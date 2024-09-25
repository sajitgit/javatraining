package encapsulation;

public class Customermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj1 = new Customer();
		obj1.setAccountnumber(12345);
		obj1.setBankbalance(123);
		System.out.println(obj1.getAccountnumber());
		System.out.println(obj1.getBankbalance());
	}

}
