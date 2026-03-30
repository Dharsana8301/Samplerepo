package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		List <String> s= new ArrayList<String>(); //generic list using list interface
		//Add- add  method is used to add elements to a list
		s.add("Apple");
		s.add("Orange");
		s.add("grapes");
		s.add("apple");
		s.add("kiwi");
		System.out.println(s);
		
		//get()- Used to get a particular element using index
		System.out.println(s.get(2));
		
		//Set()- Method used to set a new value at the given index
		s.set(2, "Pineapple");
		System.out.println(s);
		
		//indexOf- Used to find the first occurrence of an element
		System.out.println(s.indexOf("Orange"));
		
		//lastIndexOf- Used to find the last occurrence of an element
		System.out.println(s.lastIndexOf("Orange"));
		System.out.println(s.indexOf("Pineapple"));
		System.out.println(s.lastIndexOf("Pineapple"));
		
		//remove()-  Method to remove an element at specified index- We can remove the elements by specifying index/Value.
		s.remove(2);
		System.out.println(s);
		
		s.remove("kiwi");
		System.out.println(s);
		
		//Contains()- Method used to check weather a given element is present or not in the list.- Boolean values
		System.out.println(s.contains("apple"));
		System.out.println(s.contains("kiwi"));
		
		//isEmpty- Used to check weather list is empty or not
		System.out.println(s.isEmpty());
		
		//size()- Used to find size of list
		System.out.println(s.size());
		
		

	}

}
