package builder;

public class Bedroom {

	private int ceilingHeight;
	private int floorNumber;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;
	
    public Bedroom(int ceilingHeight, int floorNumber, int numberOfWindows, int numberOfDoors, boolean isDouble,
			boolean hasEnsuite) {
		super();
		this.ceilingHeight = ceilingHeight;
		this.floorNumber = floorNumber;
		this.numberOfWindows = numberOfWindows;
		this.numberOfDoors = numberOfDoors;
		this.isDouble = isDouble;
		this.hasEnsuite = hasEnsuite;
	}
	
    
}
