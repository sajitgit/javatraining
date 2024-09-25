package exception;

public class Multicatch {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 10;
		int b = 20;
		int sum = 10+20;
		
		try {
		
			int arr[] =new int[5];
			arr[6]=20;
		int division = sum /0;
		
		}
		
		catch(ArithmeticException e) {
			
			
			System.out.println(e);
			System.out.println("custom message");
		}
		
		catch(ArrayIndexOutOfBoundsException are) {
			
			System.out.println(are);
			System.out.println("custom message for array exception");
		}
		
		catch(Exception ex) {
			
			System.out.println(ex);
			System.out.println("custom message for simple exception");
		}
		
		finally{
			
			System.out.println("This will be exacuted even though the exception is handled or not");
		}
		
		System.out.println("Program continued");
	}

}
