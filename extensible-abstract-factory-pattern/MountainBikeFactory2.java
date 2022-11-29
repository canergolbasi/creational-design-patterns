
public class MountainBikeFactory2 extends BikeFactory2 {

	@Override
    public BikePart create(String type) {
        if (type.equalsIgnoreCase("tire")) {
            return new MountainBikeTire2();
        } else if (type.equalsIgnoreCase("handlebar")) {
            return new MountainBikeHandlebar2();
        } else {
            return null;
        }
    }
}
