package week1.day2.Bonus;

public class LearnMethods {

	// Declaring a method

	// *Syntax: AccessSpecifier returnType or dataType methodName(){ code }

	// AccessSpecifier : public , private ,protected , default
	//* public - Method be called anywhere
	//* private - Method be called only within Class
	//* protected - Method be called only within the package , if needed to be called in a different package then inheritance concept should be applied.
	//* default - Method be called anywhere within Package 
	

	// returnType - void : is a function which does not return any value

	// dataType - char, byte ,int , long , short ,float ,double , boolean : Returns a value
	// Values (needs a return Statement)
	
	//Syntax : AccessSpecifier returnType methodName(){}


	public void firstName() {

		System.out.println("First name:" + " " + "Naveen");

	}

	public void lastName() {

		System.out.println("Last name:" + " " + "Elumalai");
	}

	public void skinTone() {

		System.out.println("Skin Colour:" + " " + "Dusky");

	}
	
	public int age() {
	
		return 25;
	}

	// To call Declared methods a object has to be created for the class inside main
	// method ,to call all the methods

	public static void main(String[] args) {

		// Syntax to create an Object : ClassName objName = new ClassName();

		LearnMethods obj = new LearnMethods();
		obj.firstName();
		obj.lastName();
		obj.skinTone();
		System.out.println("My age is: "+obj.age());

	}

}
