package inheritance;

public class MultiLevelChild extends MultiLevelParent {
	public void print() {
		System.out.println("This is a child method");
		
	}

	public static void main(String[] args) {
		
		MultiLevelChild obj= new MultiLevelChild();
		obj.display();
		obj.sum(2, 6);
		obj.print();
	}

}
