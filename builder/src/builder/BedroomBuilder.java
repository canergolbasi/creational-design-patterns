package builder;

public class BedroomBuilder implements Builder {

	private int ceilingHeight;
    private int floorNumber;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;
    
    public BedroomBuilder() {
    }

	@Override
	public BedroomBuilder setCeilingHeight(int ceilingHeight) {
		this.ceilingHeight = ceilingHeight;
		return this;
	}

	@Override
	public BedroomBuilder setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
		return this;
	}

	@Override
	public Builder setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
		return this;
	}

	@Override
	public Builder setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
		return this;
	}

	public BedroomBuilder setDouble(boolean isDouble) {
		this.isDouble = isDouble;
		return this;
	}

	public BedroomBuilder setHasEnsuite(boolean hasEnsuite) {
		this.hasEnsuite = hasEnsuite;
		return this;
	}
    
	public Bedroom createRoom() {
        return new Bedroom(ceilingHeight, floorNumber, numberOfWindows, numberOfDoors, isDouble, hasEnsuite);
    }
    
	
}
