package polymorphism;

public class Child extends Parent{
	public void display(String s) {
		super.display("Automation");
		System.out.println(s);
		System.out.println("Child");
		
	}

	public static void main(String[] args) {
		Child obj= new Child();
		obj.display("Java");

	}

}
