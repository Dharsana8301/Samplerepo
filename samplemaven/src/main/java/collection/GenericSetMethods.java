package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set<String> s= new HashSet<String>();
		//add- to add elements to the set
		s.add("Yellow");
		s.add("Red");
		s.add("Blue");
		
		//addAll()- Used to add /Merge two list
		Set<String> s1= new HashSet<String>();
		s1.add("Green");
		s1.add("Violet");
		s.addAll(s1); //To add all the elements of s1 to s
		System.out.println(s);
		
		//contains()- Used to check elt contains in set
		System.out.println(s.contains("Black")); //false
		
		//containsAll- Used to check weather all the elements of one set is contained in another set
		System.out.println(s.containsAll(s1)); //True
		System.out.println(s1.containsAll(s)); //false
		
		//isEmpty
		System.out.println(s.isEmpty());
		
		//Remove- Only can be removed by element not index because set is unordered
		s.remove("Violet");
		System.out.println(s);
		
		//removeAll()- Used to remove all the elements from one set
		s.removeAll(s1);
		System.out.println(s);
		
		//size()- used to find size of list
		System.out.println(s.size());
		System.out.println(s1.size());
		
		//clear()- Used to delete all the elements in the set only structure will be there
		s.clear();
		System.out.println(s);

	}

}
