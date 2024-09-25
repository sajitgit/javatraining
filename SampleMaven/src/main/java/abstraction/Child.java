package abstraction;

public class Child extends AbstractParent{
	
	
	public void display() {
		
		System.out.println("Implemented abstract method here");
	}
	
	public void childmethod() {
		
		System.out.println("Method in child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj1 = new Child();
		obj1.display();
		obj1.childmethod();
		obj1.nonabstractm1();
	}

}
