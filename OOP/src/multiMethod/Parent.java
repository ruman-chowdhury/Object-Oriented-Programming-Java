package multiMethod;
import java.util.Scanner;
public class Parent {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		//creating object/instance of child class
		Child object =new Child(); 
		
		System.out.println("Enter Name:");
		String temp =input.nextLine(); //taking Name input
		
		object.setName(temp);
		object.saying();

	}

}
