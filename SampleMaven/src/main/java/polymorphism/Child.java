package polymorphism;

public class Child extends Parent {
	
	public void display(int a,int b) {
		
		super.display(100,200);
		System.out.println("Method in child");
		System.out.println("Child a is"+a+"Child b is"+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Child obj1 = new Child();
			obj1.display(10, 20);
			
	}

}
