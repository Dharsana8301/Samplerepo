package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		Set<String> s= new HashSet<String>();
		
		s.add("Yellow");
		s.add("Red");
		s.add("Blue");
		s.add("Green");
		s.add("Purple");
		
		//Iterator
		Iterator it= s.iterator(); //like reference variable creation
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//remove last element only
		it.remove();
		System.out.println(s);
		

	}

}
