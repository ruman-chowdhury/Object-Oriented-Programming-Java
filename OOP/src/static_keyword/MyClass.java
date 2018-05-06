package static_keyword;

public class MyClass {

	public static void main(String[] args) {
		
		//static_keyword: don't need to create any object,only classname.var/method
		Test.sId=5;
		System.out.println("Id: "+Test.sId);
		
		//without static method
		Test t=new Test();
		Test t2=new Test();
		
		t.withoutStatic();
		t2.withoutStatic();
		
		Test.withStatic();

	}

}
