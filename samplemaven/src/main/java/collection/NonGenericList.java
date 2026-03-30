package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericList { // all datatypes allowed

	public static void main(String[] args) {
		List L= new ArrayList();
		
		//add()
		L.add("Java");
		L.add(23);
		L.add("VP Nagar");
		L.add(2.12f);
		L.add('a');
		
		System.out.println(L);
		
		//get()
		System.out.println(L.get(2));
		
		//Set()
		L.set(3, "Automation");
		System.out.println(L);
		
		//indexOf()
		System.out.println(L.indexOf("Java"));
		
		//remove()
		L.remove(2);
		System.out.println(L);
		
		//contains()
		System.out.println(L.contains("Java"));
		
		//isEmpty()
		System.out.println(L.isEmpty());
		
		//size()
		System.out.println(L.size());
		

	}

}
