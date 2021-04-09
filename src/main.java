
public class main {

	public static void main(String[] args) {
		/*
		 * 1. Go to IFruits.java file first then read the comments
		 * 2. Go to Fruits.java file then read the comments
		 * 3. Go to Apple.java file then read the comments
		 */
		Apple apple = new Apple("This fruit is commonly colored red", 5); /*Eto mapapansin mo pag may constructor na nagiiba na ung 
		 																	way ng pag instantiate ng object natin, kelangan mo ng 
		 																	ipasa muna ung mga constructor properties like ung 
		 																	description and ung price*/
		apple.displayFruitDescription();
		System.out.println("Your total price: " + apple.getTotalPrice(5));
		
		apple.setPrice(9);												  /*So dto pwede pa dn natin gamitin ung setters natin para
		 																	maset ung value na gusto nating baguhin eto ung safe way
		 																	para baguhin ung mga values sa loob ng class*/		
		System.out.println("Your total price: " + apple.getTotalPrice(5));
	}

}
