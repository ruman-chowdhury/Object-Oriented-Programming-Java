package constructors;

public class MyClass {

	public static void main(String[] args) {
		
		// when we've no constructor,java provide default constructor
		//default constructor is created when obj/ref is created of a class
		DefaultCons df=new DefaultCons();
		
		//as we didn't pass any value,the constructor without parameter will be called
		ParamCons pc=new ParamCons();
		pc.display();
		
		//passing one string data 
		ParamCons pc2 =new ParamCons("Ruman Chowdhury");
		pc2.display();
		
		//passing two data
		ParamCons pc3 =new ParamCons("Max Junior",27);
		pc3.display();


	}

}
