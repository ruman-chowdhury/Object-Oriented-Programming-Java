package specifiers;

//If we wanna use a class from another package,we need to import like this
//to use all class,use star(*) in the place of Banana class
import specifiers2.Banana;

public class Fruits {

	public static void main(String[] args) {
		// 
		Apple a = new Apple();
		a.color="red";
		a.AppleColor();
		
		//from another package
		Banana b = new Banana();
		b.bColor="Yellow";
		b.bananaColor();

	}

}
