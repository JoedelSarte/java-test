
public class Square extends Shape {
	
	/*
	 * Ung next method sa baba ang tawag dto is method overriding isa rin syang form
	 * of polymorphism. So bakit ksi alam naman natin na meron ng method si Shape class 
	 * which is inextend natin at ininherit natin pero gnwan natin sya ng bagong sets of
	 * instruction na instead na pnprint natin is ung default na nakay shape class eh eto
	 * ung gngawa nya or pnprint nya. As long as wala kang bnago sa getShapeDescription the return type
	 * or mga parameters nya ang tawag dun is method overriding. Inooverride mo lang ung instruction
	 * sa loob ng function
	 */
	public void getShapeDescription() {
		System.out.println("Hey this is square!");
	}
	
	/*
	 * Ang tawag naman dto sa gnawa natin is method overloading. So mapapansin mo magkaparehas sila 
	 * ng pangalan sa method sa taas which is getShapeDescription pero ang pnagkaiba nla is pnapasahan mo
	 * ng bagong parameter si getShapeDescription which is ung color so ganto nagwwork si method overloading.
	 * So ilang beses mo pwedeng ioverload ang isang method, kahit ilan pwede basta magbbago dn ung set of parameters mo
	 * so for example bawal mo na gamitin si getShapeDescription(string) na string pa dn ung parameter pwedeng ang gawin mo
	 * is getShapeDescription(int) or getShapeDescription(String, int)
	 */
	public void getShapeDescription(String color) {
		System.out.println("Hey the color of the square is " + color);
	}
	
}
