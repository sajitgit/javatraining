package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Multiplearraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Tuesday");
		l1.add("Monday");
		
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("Wednesday");
		
		l2.addAll(l1);
		System.out.println(l2);
		//l2.removeAll(l1);
		//System.out.println(l2);
		Collections.sort(l1);
		System.out.println(l1);
		System.out.println(l1.get(1));
		l1.set(1, "Thursday");
		System.out.println(l1);
		

	}

}
