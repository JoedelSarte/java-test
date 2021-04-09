
public abstract class Fruits implements IFruits {
	
	/*
	 * This is an example of abstract class kung iddescribe ko si abstract class sya naman ung parang nagbbigay ng 
	 * set of instructions ng interface so kung is interface is blueprint si abstract naman ung nagbbigay ng instruction kung 
	 * pano gawin ung nasa blueprint parang sa building ulit eto ung nagssabi kung ano dapat mauna kung semento muna then bakal 
	 * then hollow blocks. So pano un kelangan ba palaging may interface bago magkaroon ng abstract ang sagot is
	 * hindi naman, di naman sya required but having a blueprint will makes your programming easier ksi makakasure ka na 
	 * naiimplement mo lahat ng need mong methods or functions so pano namamake sure na naiimplement lahat, try mo idelete 
	 * lahat ng functions sa baba and mageerror ka ksi ung interface is pnpilit ka na kelangan mong magkaroon ng gantong functions.
	 * So pano un hindi ko naman kelangan ung ibang functions na snsabi nung interface meron lang siguro akong need na dalawa or 
	 * tatlong functions na iimplement so ang sagot dun is okay lang naman leave it as blank pero kelangan nandun lang ung method.
	 * This is the last oop principle which is called abstraction, pano sya nagwwork ang ibig sabihin lang eh gngawan mo na 
	 * ng set of functions or methods or any complicated methods/functions para ung mag iinherit ng class na to eh wala ng paki
	 * sa implementation mo for example ung Apple na class ininherit nya si fruits wala na syang paki sa getTotalPrice kung 
	 * anong formula na nandun alam nya lang na may function sya ganun and ready nya ng gamitin. So tingin ka ulit dun sa line 
	 * number 2 mapapansin mo implements ung nakalagay ganto ung gnagamit pag ang gusto natin gamitin is si interface palaging
	 * implement ksi iniimplement natin ung mga sets of functions. So possible na magkaroon ka ng multiple interface sa isang class.
	 * So tandaan natin pag interface implements sya then pag gusto nating maginherit from a parent class extends sya. Another thing
	 * pala si abstract class is hindi mo pwedeng iinstantiate so pag tnry mo iinstantiate sya example Fruits fruits = new Fruits()
	 * hindi sya possible ksi ang abstract class ay pwede mo lang iinherit or gawing parent class.
	 */
	
	private String description;
	private int price;
	
	/*
	 * So ung nasa babang function ayan mapapansin mo same name dn sya nung class natin ang tawag dyan is constructor. So eto ung 
	 * set of parameters na need nating ibigay para mainstantiate natin ung isang object but in this case it is an abstract class.
	 * So ung magiinherit na lang na class neto ung makakapagimplement ntong constructor. So by default naman si java is nagsset ng 
	 * default na constructor kung wala kang gnawa for example wala kang gnawang public Fruits(String description, int price) then by
	 * default meron kang public Fruits() na ganyan pero hindi mo na need gawin yan or itype ksi si java na nagpprovide nyan.
	 * 
	 * Another thing na mapapansin mo jan is ung this. ang ibig sabihin lang nyan na ang tntukoy nyang this eh ung property na meron 
	 * tong class na to tngnan mo sa taas meron tayong declaration dba ng description and price tapos sa constructor din natin
	 * ang pangalan ng parameters is description and price. So pag di natin nilagyan ng this mallito si java kung kanino ba natin
	 * snset ung mga values na un so gngamit natin ung this. para sa mga properties nung class mismo.
	 */
	
	public Fruits(String description, int price) {
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int getTotalPrice(int quantity) {
		return quantity * price;
	}

	@Override
	public void displayFruitDescription() {
		System.out.println(description);
	}

}
