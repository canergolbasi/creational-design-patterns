

public class KitchenBuilder implements Builder {
	
    private int ceilingHeight;
    private int floorNumber;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean hasDishwasher;
    private boolean hasMicrowave;
	
    public KitchenBuilder() {
    }
    
    @Override
	public KitchenBuilder setCeilingHeight(int ceilingHeight) {
		this.ceilingHeight = ceilingHeight;
		return this;
	}
    
	@Override
	public KitchenBuilder setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
		return this;
	}
	@Override
	public KitchenBuilder setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
		return this;
	}
	
	@Override
	public KitchenBuilder setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
		return this;
	}
		
    
    
    

}
