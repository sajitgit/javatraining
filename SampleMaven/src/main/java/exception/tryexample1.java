package exception;

public class tryexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 10;
		int b = 20;
		int sum = 10+20;
		
		try {
		
		int division = sum /0;
		
		}
		
		catch(ArithmeticException e) {
			
			
			System.out.println(e);
			System.out.println("custom message");
		}
		
		System.out.println("Program continued");
		
	}

}
