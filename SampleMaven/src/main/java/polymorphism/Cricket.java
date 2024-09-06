package polymorphism;

public class Cricket extends Sports{

	public void play() {
		super.play();
		System.out.println("Playing in cricket method");
	}
	
	public static void main(String args[]) {
		
		Cricket obj1 = new Cricket();
		obj1.play();
	}
}
