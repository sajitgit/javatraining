package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s1 = new HashSet<String>();
		s1.add("Monday");
		s1.add("Tuesday");
			
		System.out.println(s1);
			
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(10);
		hs1.add(20);
				
		System.out.println(hs1);
		
		HashSet<Integer> hs4 = new HashSet<Integer>();
		hs4.add(30);
		
		HashSet hs2 = new HashSet();
		hs2.add("hello");
		hs2.add(10);
		System.out.println(hs2);
		
		Iterator<Integer> it = hs1.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
			hs1.remove(10);
			System.out.println(hs1);
			
			hs1.addAll(hs4);
			System.out.println(hs1);
			
			//hs1.removeAll(hs4);
			//System.out.println(hs1);
			
			
			System.out.println(hs1.contains(20));
			System.out.println(hs1.size());
	}

}
