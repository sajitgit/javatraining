package casting;

public class Dog extends Animal {
	
	
	public void method() {
		System.out.println("Dog Method");
	}

	public static void main(String[] args) {
		// TODO Autod-generated method stub
		Animal an = new Dog();
		an.method();
		
		if(an instanceof Dog) {
			
			Dog d =(Dog)an;
			d.method();
		}

	
		}
	
		
		
	}
