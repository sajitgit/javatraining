package abstraction;

public class Video extends Google {
	
	
	public void search() {
		
		System.out.println("Video search implemented");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video obj1 =  new Video();
		obj1.search();
		Image obj2 = new Image();
		obj2.search();
	}

}
