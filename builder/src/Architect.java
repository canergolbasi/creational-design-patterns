package builder;

public class Architect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bedroom room=new BedroomBuilder().setCeilingHeight(5).setFloorNumber(1).setFloorNumber(4).setDouble(false).setHasEnsuite(false).createRoom();
		Bedroom room2=new BedroomBuilder().setCeilingHeight(7).createRoom();
	}

}
