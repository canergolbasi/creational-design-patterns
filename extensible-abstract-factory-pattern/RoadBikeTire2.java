
public class RoadBikeTire2 extends Tire2{

	 private static final String width = "NARROW";
	    private static final String pressure = "HIGH";
	    
	    @Override
	    public void getDescription() {
	        System.out.println("Road bike tire width: " + width + ", pressure: " + pressure);        
	    }
}
