package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l1 = new ArrayList();
		System.out.println("Non generic collection");
		l1.add("Sajith");
		l1.add(30);
		System.out.println(l1);
		System.out.println(l1.contains("Sajith"));
		
		
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("Aluva");
		l2.add("Aluva");
		
		l2.remove(1);
		
		l2.add(null);
	
		l2.remove(null);
		l2.add(1, "kochi");
		//System.out.println(l2);
		
		for(int i=0; i<l2.size();i++) {
			
			System.out.println(l2.get(i));
		}
		
		System.out.println("for each loop");
		
		for(String i : l2) {
			
			System.out.println(i);
		}
		
		System.out.println("Iterator");
		
		Iterator<String> it = l2.iterator();
		
		while(it.hasNext()) {
			
			
			System.out.println(it.next());
		}
		
		
		it.remove(); //removes the last element
		
		System.out.println(l2);
	}

}
