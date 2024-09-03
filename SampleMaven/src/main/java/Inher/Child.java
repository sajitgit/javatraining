package Inher;

public class Child extends Parent{
	
	String colour ="White";
			
	public void display() {
		
		System.out.println("this is a child method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Child obj1 = new Child();
		obj1.engine();
		System.out.println(obj1.speed);
		obj1.display();
		System.out.println(obj1.colour);
		
	}

}
