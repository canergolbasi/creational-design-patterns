
public class FactoryCreator2 {

	 public static BikeFactory2 createFactory(String type) {
	        
	        if(type.equalsIgnoreCase("mountain bike")) {
	            return new MountainBikeFactory2();
	        } else if(type.equalsIgnoreCase("road bike")) {
	            return new RoadBikeFactory2();
	        } else {
	            System.out.println("Please specify a valid type");
	            return null;
	        }
	        
	    }
}
