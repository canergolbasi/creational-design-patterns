
public class RoadBikeFactory2 extends BikeFactory2{

	@Override
    public BikePart create(String type) {
        if (type.equalsIgnoreCase("tire")) {
            return new RoadBikeTire2();
        } else if (type.equalsIgnoreCase("handlebar")) {
            return new RoadBikeHandlebar2();
        } else {
            return null;
        }
    }
}
