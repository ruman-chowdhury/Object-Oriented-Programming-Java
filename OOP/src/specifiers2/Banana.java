package specifiers2;

//To use this class,class methods,variable in the fruits class which is in another package we should declare all as public
//public means,it can be accessible for all.Without mention public it will be default specifier
//default specifier is accessible only in the classes of same package
public class Banana {

	public String bColor;
	
	public void bananaColor() {
		System.out.println("Banana color is: " +bColor);
	}
}
