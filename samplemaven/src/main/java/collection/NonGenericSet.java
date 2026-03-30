package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSet {

	public static void main(String[] args) {
		Set s= new HashSet();
		s.add("Donald");
		s.add(23);
		s.add("XYZ street");
		
		Set s1= new HashSet();
		//add
		s1.add("Blue");
		s1.add("Green");
		s1.add("Red");
		//Addall()
		s.addAll(s1);
		System.out.println(s);
	//contains()
		System.out.println(s.contains("Red"));
		
		//containsAll
		
		System.out.println(s.containsAll(s1));
		//isEmpty
		System.out.println(s.isEmpty());
		//remove()
		s.remove("Blue");
		System.out.println(s);
		
		//removeAll()
		
		s.removeAll(s1);
		System.out.println(s);
		
		//size
		System.out.println(s.size());
		
		//clear()
		s.clear();
		System.out.println(s);
		
		
	}

}
