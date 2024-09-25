package exception;

public class UnCheckedthrows {
	
	
	public static void m1() throws ArithmeticException{
		
		throw new ArithmeticException("Arithmetic");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

}
