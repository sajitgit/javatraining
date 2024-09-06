package Superexample;

public class Dog extends Animal {
	
	String colour = "Black";
	
	public Dog(int a) {
		
		super(10);
		System.out.println("Child class constructor");
		
	}
	
	public void display() {
		
		
		
		System.out.println("Method in child");
		System.out.println(colour);
		System.out.println(super.colour);
		super.display();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog obj1 = new Dog(10);
		System.out.println(obj1.colour);
		obj1.display();
		
	}

}
