package method_Nesting;

public class MaxNumber {

	//this method return an integer value
	int max(int num1,int num2){
		if(num1>num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	
	//Nesting method:method inside a method
	public void display() {
		
		int result = max(5,7);
		System.out.println(result);
	}
}
