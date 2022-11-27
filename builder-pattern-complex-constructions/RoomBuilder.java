
public class RoomBuilder {
	
	private int ceilingHeight;
    private int floorNumber;
    private int numberOfWindows;
    private int numberOfDoors;
    private RoomListBuilder roomListBuilder;

    public RoomBuilder() {
    }
    
    public RoomBuilder(RoomListBuilder roomListBuilder) {
        this.roomListBuilder = roomListBuilder;
    }


    public RoomBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    public RoomBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }


    public RoomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public RoomBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public Room createRoom() {
        return new Room(ceilingHeight, floorNumber, numberOfWindows, numberOfDoors);
    }
    
    public RoomListBuilder addRoomToList() {
        Room room = createRoom();
        this.roomListBuilder.addRoom(room);
        return this.roomListBuilder;
    }

}
