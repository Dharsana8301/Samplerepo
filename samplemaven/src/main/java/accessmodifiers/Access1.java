package accessmodifiers;

public class Access1 {
	public void display1(){
		System.out.println("public method");
	}
	
	private void display2(){
		System.out.println("private method");
		
	}
	protected void display3() {
		System.out.println("Protected method");
		
	}
	void display4() {
		System.out.println("Default method");
	}

	public static void main(String[] args) {
		Access1 obj= new Access1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();

	}

}
