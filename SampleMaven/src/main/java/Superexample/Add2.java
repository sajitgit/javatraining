package Superexample;

public class Add2 extends Add1{
	
	static int rsum;
	public void divisiblecheck() {
		
		super.addition(10,30);
		
		if(rsum%10 == 0) {
			
			System.out.println("Result is divisible by 10");
		}
		
		else {
			
			System.out.println("Result is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add2 obj1 = new Add2();
		rsum = obj1.addition(10,30);
		obj1.divisiblecheck();
	}

}
