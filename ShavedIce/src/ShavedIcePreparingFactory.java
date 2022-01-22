
public class ShavedIcePreparingFactory {
	
public static ShavedIceFactory getShavedIceFlavor(String flavor) {
        
        if("Grape".equalsIgnoreCase(flavor)) {
            return new GrapeShavedIce(flavor);
        }  
        if("Green Apple".equalsIgnoreCase(flavor)) {
            return new GreenAppleShavedIce(flavor);
        }
        if("Lemonade".equalsIgnoreCase(flavor)) {
            return new LemonadeShavedIce(flavor);
        }
        
        return null;
    }

}
