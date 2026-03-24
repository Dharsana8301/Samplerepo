package abstraction;

public class AbstractionChild extends AbstractionParent {

	public static void main(String[] args) {
		
		AbstractionChild obj= new AbstractionChild();
		obj.display();
		obj.print();
		obj.sum();

	}

	@Override
	public void display() {
		System.out.println("Display abstract method");
		
	}

	@Override
	public void print() {
		System.out.println("Print abstract method");
		
	}

}
