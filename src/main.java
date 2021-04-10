
public class main {

	public static void main(String[] args) {
		/*
		 * Pwede kang magcreate ng array ng objects using yung normal way ng paggawa ng array ung for example is 
		 * int[] thisIsArray = new int["Dto nakalagay ung length ng list mo"] so ganun dn pag sa list ng objects pwede rin ung 
		 * normal na int[] thisIsArray = [1, 2, 3, 4, 5] pagdating naman sa objects ang magging hitsura nun is ganto
		 * Shoes[] shoes = new Shoes[] {new Shoes("Nike", 5000, "PG1"), new Shoes("Adidas", 5000, "DROSE 6.5")};
		 * so ayun pag nagiinitiate tayo ng objects sa object array same pa dn naman illagay natin kung anong index sya then 
		 * iinstantiate natin kung anong object un so sa example sa baba shoes na object un kaya new Shoes()
		 */
		Shoes[] shoeList = new Shoes[3];
		shoeList[0] = new Shoes("Nike", 5000, "PG1");
		shoeList[1] = new Shoes("Adidas", 5000, "DROSE 6.5");
		shoeList[2] = new Shoes("Nike", 8000, "Venomenon");
		
		/*
		 * Eto naman in another way ng paggamit ng for loop mas kilala to sa tawag na for each ang ibig sabihin nya is for every 
		 * object inside the list un ung iiterate nya so for each shoe in list shoeList. So mas malinis tong tngnan ksi hindi mo na 
		 * need isa isahin per index ung shoeList pra maaccess ung mga shoe na object. May times pa dn na mas maganda gamitin ung 
		 * normal na for loop which is ung for(int x; x<length; x++) ksi gusto nating kontrolin ung mga objects based sa index
		 * for example gusto natin sa list natin ung odd numbers lang ung may ggalawin tayo ganun.
		 * 
		 * Punta ka sa ComputePrice na class
		 */
		for(Shoes shoe: shoeList) {
			System.out.println("==============================");
			System.out.println("Shoe Brand: " + shoe.getBrand());
			System.out.println("Model: " + shoe.getModel());
			System.out.println("Price: " + shoe.getPrice());
			/*
			 *  ComputePrice.getFinalComputedPrice(shoe.getPrice())
			 *  
			 *  So kagaya nga ng sabi ko dun sa ComputePrice na class hindi na natin kelangan iinstantiate pa si ComputePrice para 
			 *  lang magamit ung mga functions na static pwede na natin syang gamitin na ganto 
			 */
			System.out.println("Final Price After Tax: " + ComputePrice.getFinalComputedPrice(shoe.getPrice()));
			System.out.println("Final Price Thru Delivery: " + ComputePrice.getFinalComputedPriceForDelivery(shoe.getPrice()));
			System.out.println("==============================");
		}
	}

}
