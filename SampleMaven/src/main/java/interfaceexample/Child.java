package interfaceexample;

public class Child implements Parent1,Parent2{

	
	public void parent1method() {
		
		System.out.println("Implemented Parent 1 method here");	
		System.out.println(name);
	}
	
	
	public void parent2method() {
		
		System.out.println(name);
		System.out.println("Implemented parent 2 method here");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj1 = new Child();
		obj1.parent1method();
		obj1.parent2method();
		
	}

}
