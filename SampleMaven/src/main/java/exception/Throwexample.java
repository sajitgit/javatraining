package exception;

public class Throwexample {
	
	
	public static void sum(int num1,int num2) {
		
		int sum = num1+num2;
		
		if(sum>50) {
			
			throw new ArrayIndexOutOfBoundsException("sum should not be > 50");
		}
		
		else {
			System.out.println("Sum is <50");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {	
		sum(10,60);
	}
	
	catch(ArrayIndexOutOfBoundsException e) {
		
		System.out.println(e);
	}
	
	System.out.println("Hello");
		
	}

}
