
public interface IFruits {
	
	/*
	 * Eto ung tntawag na interface kung ako magddescribe ng interface sya ung matatawag ko
	 * na blueprint ng isang program, bakit sya blueprint, kung mapapansin mo sya ung mga functions sa 
	 * baba walang instructions. For example alam lang natin na may getTotalPrice pero hindi natin alam 
	 * kung pano kunin ung total price alam lang natin na merong getTotalPrice na function na tumatanggap ng 
	 * quantity na parameter and may return type sya na integer. Kagaya ng blueprint ng isang building
	 * nakalagay lang dun ung mga sukat and structure or hitsura ng building pero hindi natin alam kung 
	 * pano ggawin ung pader kung una ba muna eh bakal ang illagay or semento ba muna so kagaya ng interface
	 * blueprint lang sya.
	 * 
	 * Another thing na hindi ko nasabi dun sa past exercises natin ang structure ng isang function/method.
	 * So isa isahin natin sya for example public int getTotalPrice(int quantity). Si public is ung visibility declation mo
	 * and may 3 types sya public, private and protected. Si public ay accessible sya sa buong project mo or buong application mo,
	 * si private naman ang ibig sabihin nun is ung class lang na un ung makakaaccess nung function/method na un so for example 
	 * meron akong class na Apple tapos meron akong private function na checkWeight si Apple lang makakagamit nun kahit na tawagin ko 
	 * si Apple sa ibang class di nila makkita ung function na un. Si protected naman accessible sya sa ibang class as long as 
	 * nasa isang package lang sila. Next is ung int sa public int getTotalPrice(int quantity) si int jan ay ung return type 
	 * snsabi lang dto na ung getTotalPrice na function ay nagrreturn ng int na data type so pwedeng iba iba yan pwedeng string 
	 * array so pag cnall mo ung function na un, un ung expected mong result. Next is si getTotalPrice eto naman eh function name
	 * sa naming convention naman keep it descriptive as possible kung ano gngawa ng function mo. Last is ung parameters eto naman list 
	 * ng mga parameters na need mong ipasa para magrun ung function mo kahit ilang parameters pwede mong ipasa and need mo rin ideclare
	 * ung data type nila if its int or string or any object. 
	 */
	
	public int getTotalPrice(int quantity);
	public void displayFruitDescription();

}
