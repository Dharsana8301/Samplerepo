package superkeyword;

public class ChildClassConstructor extends ParentClassConstructor{
	public ChildClassConstructor(){
		super();
		System.out.println("This is child class constructor");
	}

	public static void main(String[] args) {
		ChildClassConstructor obj= new ChildClassConstructor();
		

	}

}
