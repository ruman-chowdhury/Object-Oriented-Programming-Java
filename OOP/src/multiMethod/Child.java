package multiMethod;

public class Child {
	
	private String girlName;
	
	
	public void setName(String Name) {
		girlName=Name;
	}
	public String getName() {
		return girlName;
	}
	
	//method for display
	public void saying() {
		System.out.printf("She is %s",getName());
	}


}
