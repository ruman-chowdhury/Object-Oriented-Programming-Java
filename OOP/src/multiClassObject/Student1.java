package multiClassObject;

public class Student1 {
	
	private int id;
	private String name;
	private String city;
	private String zipcode;
	
	//Private variable is only accessible inside the class,where it's declared
	//to access in another class,we can declare public method where 
	//we can set the value and get it by returning the value
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	//method for display the result
	public void showInformation() {
		System.out.println("ID: "+ getId());
		System.out.println("Name: "+ getName());
		System.out.println("City: "+ getCity());
		System.out.println("Zipcode: "+ getZipcode());
		System.out.println();
	}
}
