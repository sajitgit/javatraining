package Inher;

public class Developer extends Employee {
	
	
	public void developermethod() {
		
		System.out.println("This is an developer method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Developer obj1 = new Developer();
		obj1.employeemethod();
		obj1.developermethod();
		Tester obj2 = new Tester();
		obj2.testermethod();
		
	}

}
