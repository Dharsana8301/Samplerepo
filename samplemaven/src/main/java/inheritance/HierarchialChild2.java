package inheritance;

public class HierarchialChild2 extends HierarchialParent{
public void display1() {
	System.out.println("Child class 2");
	
}
	public static void main(String[] args) {
		HierarchialChild2 obj2= new HierarchialChild2();
		obj2.display();
		obj2.display1();

	}

}
