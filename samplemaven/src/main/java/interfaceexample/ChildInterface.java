package interfaceexample;

public class ChildInterface implements ParentInterface {
	public void sum() {
		System.out.println("sum in child class");
	}

	public static void main(String[] args) {
//		ChildInterface obj= new ChildInterface();
//		obj.display();
//		obj.print();
//		obj.sum();
		
	//reference Creation- If we want to invoke only parent class methods
		ParentInterface ref= new ChildInterface(); // child interface is a class not an interface
		ref.display();
		ref.print();

	}
	

	@Override
	public void display() {
		System.out.println("Display interface");
		
	}

	@Override
	public void print() {
		System.out.println("Print interface");
		
	}

}
