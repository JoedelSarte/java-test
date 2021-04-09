
public class Apple extends Fruits {
	
	/*
	 * So ayun nga dba eto inextend natin si Fruit na class ung abstract class natin kagaya ng snabi ko dun 
	 * hindi sya pwedeng iinstantiate ung fruits pwede lang natin syang gawing parent class. So ayun mappansin mo meron lang 
	 * tayong constructor dto and since iniinherit natin si Fruits need na lang natin gamitin ung constructor na meron si 
	 * Fruits kaya gngamit natin ung syntax na super para sabihin na gngamit natin ung constructor ni parent class.
	 */
	public Apple(String description, int price) {
		super(description, price);
	}
	
}
