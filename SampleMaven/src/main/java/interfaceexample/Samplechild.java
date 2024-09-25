package interfaceexample;

public class Samplechild implements Sampleparent{

	public void m1() {
		
		System.out.println("Implemented method m1 here");
	}
	
	
	public void m2() {
		
		System.out.println("Child class method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sampleparent obj1 = new Samplechild();
		obj1.m1();
		
		Samplechild obj2 = new Samplechild();
		obj2.m2();
		obj2.m1();//you can call from child object also
	}


}
