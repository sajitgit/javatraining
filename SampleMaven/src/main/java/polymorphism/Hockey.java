package polymorphism;

public class Hockey extends Sports {

	public void play() {
		super.play();
		
		System.out.println("Playing in Hockey method");
	}
	
	
	public static void main(String args[]) {
		
		Hockey obj3 = new Hockey();
		obj3.play();
	}
}
