package polymorphism;

public class Football extends Sports{

	
	public void play() {
		super.play();
		System.out.println("Playing in football method");
	}
	
	public static void main(String args[]) {
		
		Football obj2 = new Football();
		obj2.play();
	}
}
