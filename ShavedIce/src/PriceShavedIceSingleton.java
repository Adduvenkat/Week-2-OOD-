
public class PriceShavedIceSingleton {
	
	
	private static PriceShavedIceSingleton uniqueInstance;
  
	private PriceShavedIceSingleton() {
		
	}
  
	public static PriceShavedIceSingleton getInstance() {
		if (uniqueInstance == null) {
			System.out.println("--- Creating a unique instance");
			uniqueInstance = new PriceShavedIceSingleton();
		}
		System.out.println("\n--- Returning the existing instance");
		return uniqueInstance;
	}
	
	public void price()
	{
		System.out.println("$0.50 for Small size  Shaved Ice");
		System.out.println("$0.80 for Medium size Shaved Ice");
		System.out.println("$1.00 for Large size Shaved Ice");
		
	}

}
