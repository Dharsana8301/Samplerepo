package collection;

import java.util.HashSet;
import java.util.Set;

public class ForEachLoop {

	public static void main(String[] args) {
		int arr[]= {11,22,35,46,53};
		/*for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}*/
		//For each loop- enhanced for loop
		// for(data_type variable_name : array/collection name)
		for(int a:arr)
		{
			System.out.println(a);
		}
		
Set<String> s= new HashSet<String>();
		
		s.add("Yellow");
		s.add("Red");
		s.add("Blue");
		s.add("Green");
		s.add("Purple");
		
		for(String s1 :s) {
			System.out.println(s1);
		}
		

	}

}
