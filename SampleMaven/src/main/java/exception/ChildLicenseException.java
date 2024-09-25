package exception;

public class ChildLicenseException {
	
	
	public static void ageCheck(int age) throws LicenseException {
		
		if(age>18) {
			
			System.out.println("Driver is eligible for driving");
		}
		
		else {
			
			throw new LicenseException("Not Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		try {
			ChildLicenseException.ageCheck(20);
		} catch (LicenseException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		
		
	}

}
}