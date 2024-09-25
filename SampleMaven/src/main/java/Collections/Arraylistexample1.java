package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylistexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l1 =new ArrayList();
		l1.add("Monday");
		l1.add(10);
		System.out.println(l1);
		
		List<String> l2 = new ArrayList();
		l2.add("Tuesday");
		l2.add("Wednesday");
		System.out.println(l2);
		
		System.out.println(l2.size());
		System.out.println(l2.isEmpty());
	}

}
