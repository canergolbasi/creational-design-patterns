import java.util.ArrayList;

public class HardCandy_Peppermint3 extends Candy3{

	@Override
    ArrayList<Candy3> makeCandyPackage(int quantity) {
        ArrayList hardCandyPackage = new ArrayList<>();
        for(int i = 1; i <= quantity; i++) {
            HardCandy_Peppermint3 hardCandy_Peppermint = new HardCandy_Peppermint3(); 
            hardCandyPackage.add(hardCandy_Peppermint);
        }
        
        System.out.println("One package of " + quantity + " peppermints has been made!");
        return hardCandyPackage;
        
    } 
}
