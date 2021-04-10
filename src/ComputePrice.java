
public class ComputePrice {
	
	/*
	 * private final static double productTaxPh = 0.1;
	 * 
	 * Ang tawag dto is global variable bakit sya tntawag na global variable, simply because kaya syang icall ng kahit na snong method
	 * sa loob ng class natin kung mapapansin mo ung dalawang method natin sa baba gngamit nya ung productTaxPh sa both methods. And 
	 * another thing na mapapansin mo is ung syntax na final ang ibig sabihin lang ng final is hindi na sya magbbago kahit na itry mo na 
	 * iset na productTaxPh sa isa mong method makakakuha ka lang ng error. Then next is ung static bakit sya static ksi ang mga static
	 * methods ang pwede nya lang dn gamitin is ung types na static dn ang declaration mo.
	 */
	private final static double productTaxPh = 0.1;
	
	/* Methods sa baba
	 * Ang tawag dto is static methods ang knagandahan ksi sa mga static methods is hindi na natin need iinstantiate ung object
	 * para macall ung method so ung normal na paginstantiate na ComputePrice computePrice = new ComputePrice() hindi na natin
	 * need gawin un. So maganda gawin to pag sa mga gantong operation ung may mga need lang tayong gawing methods pero hindi 
	 * naman talaga need natin kelangan gamitin ung buong class.
	 */
	public static double getFinalComputedPrice(int price) {
		return price + (price * productTaxPh);
	}
	
	public static double getFinalComputedPriceForDelivery(int price) {
		/*
		 * double deliveryFee = 300;
		 * 
		 * ang tawag naman dto is local variable ibig sabihin etong variable na to is accessible lang sa loob nung method na gnawa mo.
		 * Kahit itry mo icall tong property na to sa getFinalComputedPrice ung methods sa taas magkakaerror ka lang ksi tong deliveryFee
		 * property ay exclusive lang para kay method na getFinalComputedPriceForDelivery. So kung gusto dng gamitin ni getFinalComputedPrice
		 * si deliveryFee kelangan nyang magdeclare ng sarili nyang property na un pero in case na lahat ng method ay ggamitin si 
		 * deliveryFee then mas magandang gawin mo na syang global variable.
		 */
		double deliveryFee = 300;
		return price + (price * productTaxPh) + deliveryFee;
	}
}
