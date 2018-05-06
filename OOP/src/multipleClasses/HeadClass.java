package multipleClasses;
import java.util.Scanner;

public class HeadClass {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Name:");
		String name =input.nextLine();
		
		//creating object of branch class
		Branch branchObj =new Branch(); 
		branchObj.simpleMessage(name);
	}
}
