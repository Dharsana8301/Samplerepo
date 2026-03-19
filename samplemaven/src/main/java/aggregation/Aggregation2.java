package aggregation;

public class Aggregation2 {
String city, state;
Aggregation1 ref;
	
		public Aggregation2(String city, String state, Aggregation1 ref) {
			this.city=city;
			this.state=state;
			this.ref=ref;
		}
		public void studentdisplay() {
			System.out.println(ref.name+" "+ref.rollno+" "+ref.address);//reference variable created here
			System.out.println(city+" "+state);
			
		}
		public static void main(String[] args) {
			Aggregation1 obj1= new Aggregation1 ("Dharsana",21,"ABC street");
			Aggregation2 obj= new Aggregation2("Palakkad", "Kerala",obj1); //no. of parameters become 3 so that obj created for reference will be passed as parameter
			obj.studentdisplay();
			
	}

}
