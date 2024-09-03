package Inher;

public class Puppy extends Dog {
	
	public void puppybark() {
		
		System.out.println("Puppybark");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Puppy obj1 = new Puppy();
		obj1.eat();
		obj1.puppybark();
		obj1.barking();
	}

}
