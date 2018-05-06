//Same method name,same parameter number,, different data type
//same method name,same data type,,different parameter number

package method_overloading;

public class CheckNumber {
	
	//return type method,,return integer value
		int max(int num1,int num2){
			System.out.println("For integer data with 2 param.");
			
			if(num1>num2) {
				return num1;
			}
			else {
				return num2;
			}
		}
		
		
		double max(double num1,double num2){
			System.out.println("For double data with 2 param.");
			
			if(num1>num2) {
				return num1;
			}
			else {
				return num2;
			}
		}
		
		
		//when 3 integer parameters
		int max(int num1,int num2,int num3){
			System.out.println("For integer data with 3 param.");
			
			int result=max(num1,num2); //first check 2 numbers through max()with 2 param
			return max(result,num3); //then it will be checked with num3
		}
		
	
		double max(double num1,double num2,double num3){
			System.out.println("For double data with 3 param.");
			
			double result=max(num1,num2); //method nesting
			return max(result,num3); 
		}


}
