package Inher;

public class Son extends Father {
	
	
	public void sonmethod() {
		
		System.out.println("This is a son method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son obj1 = new Son();
		obj1.grandfathermethod();
		obj1.fathermethod();
		obj1.sonmethod();
		Daughter obj2 = new Daughter();
		obj2.daughtermethod();
		
	}

}
