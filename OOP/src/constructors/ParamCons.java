//constructor mainly used to initialized the value
//others: object creation, starting a thread, calling method etc

package constructors;

public class ParamCons {
	String name;
	int age;
	
	ParamCons(){
		System.out.println("Constructor with no parameter called");

		//name="max";
		//age=25;
		//initialization manually;
		//If we didn't initialize like this,the default value will appear
	}
	
	ParamCons(String myName){
		System.out.println("Constructor with one parameter called");
		name=myName;
		age=30;
	}
	
	ParamCons(String myName,int myAge){
		System.out.println("Constructor with two parameter called");
		name=myName;
		age=myAge;
	}
	
	public void display() {
		System.out.println(name +", "+ age);
	}

}
