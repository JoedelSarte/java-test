
public class main {

	public static void main(String[] args) {
		/*
		 * To run the program click main.java in the left side panel <--- there click run as -> java application
		 * 1. Punta ka muna sa shape class then basahin mo ung mga comments
		 * 2. Punta ka naman sa triangle class for next set of comments
		 */
		Triangle triangle = new Triangle(); /*this is how we initiate a new object so technically magsstart sya */
		triangle.setDescription("This is a triangle shape"); /*so from the triangle class pwede nating maaccess ung mga properties ni Shape class*/
		triangle.setNumberOfSides(3);
		triangle.getShapeDescription();
		
		/*
		 * Punta ka sa square class para sa comments ulit
		 */
		
		Square square = new Square();
		square.setDescription("This is a square shape"); /*So eto dahil namana pa dn natin from our parent class ung property na description
													 	and ung number of sides pwede pa dn natin syang gamitin*/
		square.setNumberOfSides(2);					 
		square.getShapeDescription();				  /*So ayun nga dahil nagmethod override tayo na dapat ang llabas sana dto is this is a 
														square shape ang llabas dto is Hey this is square!*/
		square.getShapeDescription("Blue");			  /*So dto naman makkita mo ung implementation ng method overloading kung saan pnasa 
		 												natin ung string na "Blue" as a parameter then ang illabas nya na description eh iba*/
	}

}
