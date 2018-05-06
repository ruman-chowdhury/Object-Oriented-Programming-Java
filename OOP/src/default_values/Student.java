package default_values;

public class Student {

	String name;
	int id;
	char gender;
	boolean hasgf;
	
	public void display() {
		
		//default value will be printed
		System.out.println("My name is "+ name);
		System.out.println("Id is "+ id);
		System.out.println("Gender is "+ gender);
		System.out.println("Has gf is "+ hasgf);
	}
	
	public void display2() {
		
		//java doesn't give the default value for local variable
		String name2;
		int id2;
	//	System.out.println("My name is "+ name2);
	//	System.out.println("Id is "+ id2);
	
	}
}
