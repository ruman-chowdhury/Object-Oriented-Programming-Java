package primtive_refference_datatype;

public class Teacher {

	public static void main(String[] args) {
		
		// Primitive data types
		//primitive takes little storage/memory
		int x=10;
		int y=20;
		System.out.println("X: "+ x);
		System.out.println("Y: "+ y);
		
		//when copy a primitive value both are independent,both holds different location as declared initially
		x=y;
		System.out.println("X: "+ x);
		System.out.println("Y: "+ y);
		
		
		
		//a variable whose type is a Class doesn't actually holds object
		//it holds a memory location of a object,but we directly call it object
		Student max;
		max=new Student();
		Student john =new Student();
		
		max.roll=5;
		john.roll=7;
		
		max.myRoll();
		john.myRoll();
		
		//when john is assigned to max,max object location is destroyed & max is point to john's location
		//when we assign class ref/obj, both holds/point same memory location
		max=john;
		
		max.myRoll();
		john.myRoll();

	}

}
