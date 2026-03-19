package superkeyword;

public class SuperMethodChild extends SuperMethodParent {
	public void display() {
		System.out.println("This is child class method");
		super.sum();
		super.print();
	}

	public static void main(String[] args) {
		SuperMethodChild obj= new SuperMethodChild();
		obj.display();

	}

}
