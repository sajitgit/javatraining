package Inher;

public class Employee3 extends Employee2 {
	
	float totalsalary;
	public void totalsalary() {
		
		totalsalary = (basicpay+hra-pf-deduction+bonus);
	
		
	}
	
	public void salaryslip() {
		
		System.out.println("Basic pay is :" +basicpay);
		System.out.println("Deduction is :" +deduction);
		System.out.println("Bonus is :" +bonus);
		System.out.println("HRA is :" +hra);
		System.out.println("PF is :" +pf);
		System.out.println("totalsalary is :" +totalsalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee3 obj1 = new Employee3();
		obj1.getDetails();
		obj1.calculation();
		obj1.totalsalary();
		obj1.salaryslip();
	}

}
