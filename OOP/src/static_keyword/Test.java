//Restriction: we can only use static property to another static property
//exam:we can't use withoutStatic method,inside the withStatic method

package static_keyword;

public class Test {

	String sName;
	public static int sId=0;
	//need to tell a specifier where actually we use the static variable
	
	public void withoutStatic() {
		sId++;
		sName="Max Junior";
		System.out.println("Id:"+ sId +","+  sName);
		
	}
	
	public static void withStatic() {
		System.out.println("Id: "+sId);
		//we can't use sName var here;sName non static
	}
	
	
}
