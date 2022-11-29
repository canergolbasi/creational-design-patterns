
public class CandyStore3 {

	 private static final CandyFactory3 chocolateFactory = new ChocolateFactory3();
	    private static final CandyFactory3 hardCandyFactory = new HardCandyFactory();

	    public static void main(String[] args) {              
	        chocolateFactory.getCandyPackage(7, "dark");   
	        hardCandyFactory.getCandyPackage(14, "lollipop");
	        hardCandyFactory.getCandyPackage(50, "candy cane");        
	    }
}
