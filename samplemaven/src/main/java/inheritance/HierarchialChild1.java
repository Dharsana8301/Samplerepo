package inheritance;

public class HierarchialChild1 extends HierarchialParent{
public void sum() {
	int a=10;
	int b=7;
	int c= a+b;
	System.out.println(c);
}

	public static void main(String[] args) {
		HierarchialChild1 obj= new HierarchialChild1();
		obj.display();
		obj.sum();

	}

}
