
public class ShavedIceController {

	public static void main(String[] args) {
		
		   
		ShavedIceFactory GrapeShavedIce = ShavedIcePreparingFactory.getShavedIceFlavor("Grape");       
		ShavedIce small = GrapeShavedIce.prepare("Small");
		small.deliver();
		
		ShavedIceFactory GreenAppleShavedIce = ShavedIcePreparingFactory.getShavedIceFlavor("Green Apple");       
		ShavedIce medium = GreenAppleShavedIce.prepare("Medium");
		medium.deliver();
		    
		ShavedIceFactory LemonadeShavedIce = ShavedIcePreparingFactory.getShavedIceFlavor("Lemonade");       
		ShavedIce large = LemonadeShavedIce.prepare("Large");
		large.deliver();
	
		
		
		
		
		PriceShavedIceSingleton price = PriceShavedIceSingleton.getInstance();
		price.price();
		PriceShavedIceSingleton  price1 = PriceShavedIceSingleton .getInstance();
		 
		
			
			
	}

}
