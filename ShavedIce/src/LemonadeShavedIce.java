
public class LemonadeShavedIce implements ShavedIceFactory {
	
	String flavor;
	public LemonadeShavedIce(String flavor)
	{
		this.flavor = flavor;
	}
	
	
	 public ShavedIce prepare(String size) {
	        
	        if("Small".equalsIgnoreCase(size)) {
	            return new Small(flavor);
	        }  
	        if("Medium".equalsIgnoreCase(size)) {
	            return new Medium(flavor);
	        }
	        if("Large".equalsIgnoreCase(size)) {
	            return new Large(flavor);
	        }
	        return null;
	 }
}
