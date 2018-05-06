package multiClassObject;

public class Classroom {

	public static void main(String[] args) {

		//creating object.Need to create multiple obj for multiple information
		Student1 std1 = new Student1();
		
		std1.setId(11);
		std1.setName("Ruman Chowdhury");
		std1.setCity("Dhaka");
		std1.setZipcode("1207");
		std1.showInformation(); //display result
		
		Student1 std2 = new Student1();
		
		std2.setId(12);
		std2.setName("Max Junior");
		std2.setCity("Jossore");
		std2.setZipcode("1205");
		std2.showInformation(); //display result
		
		//Also we can print the result in main method,for this we need to print more time.
		//to reduce this,we have declare a method in Student1 class
		//System.out.println(std1.getId() +"."+ std1.getName() +" "+ std1.getCity() +" "+ std1.getZipcode());
		//System.out.println(std2.getId() +"."+ std2.getName() +" "+ std2.getCity() +" "+ std2.getZipcode());

	}

}
