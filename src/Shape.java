
public class Shape {
	
	/*
	 * This is a parent class so basically gusto natin na 
	 * kung ano man ung properties na
	 * meron si Shape class eh mainherit ng iba pa nating shape object
	 * */
	
	private int numberOfSides;
	private String description;
	
	/*
	 * Ung mga sunod na functions sa baba hanggang kay set description 
	 * ay tntwag nating getters and setters ung nasa taas naman na
	 * declaration ng variables like for example si private int numberOfSides
	 * mapapansin mo na private ung declaration nya ibig sabihin hindi pwedeng maaccess
	 * ng ibang class or files ung mga variables na to accessible lang sya sa loob ng Shape class
	 * ang tawag dto sa gngawa nating eto is "ENCAPSULATION" bakit importante na ineencapsulate natin sya
	 * kasi for example may nag instantiate na Shape class tapos accidentally nabago nya ung values nun
	 * magiiba na ung magging results ng mga functions natin so for example si getShapeDescription 
	 * magiiba na ung pnprint nya na description or number of sides. Encapsulation is one of the 
	 * basic principles of OOP. 
	 *
	 */
	
	public int getNumberOfSides() {
		return numberOfSides;
	}
	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void getShapeDescription() {
		System.out.println(description);
		System.out.println("It has " + numberOfSides + " sides");
	}

}
