//same name,same data type,,without this keyword it will display local data
//this key is used to get global data
//inside a static method we can't use this keyword

package this_keyword;

public class Test {
	//global variable
	String name;
	int age;
	
	public Test(String name) {
		this.name=name;
	}
	
	public Test(int age) {
		this.age=age;
	}
	
	public Test(String name,int age){
		
		//here this keyword will refer global variable
		//when we call a constructor in another constructor,
		//it will be placed at first inside the constructor
		//we can only call one constructor ,inside a constructor
		this("james Godsling");
		this.age=age;
	}
	
	public void display() {
		
		//local variable
		String name="Ruman Chowdhury";
		int age=25;
		
		System.out.println(name +","+ age);
		System.out.println(this.name +","+ this.age);
	}
}
