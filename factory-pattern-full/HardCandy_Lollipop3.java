import java.util.ArrayList;

public class HardCandy_Lollipop3 extends Candy3{

	@Override
    ArrayList<Candy3> makeCandyPackage(int quantity) {
        ArrayList hardCandyPackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            HardCandy_Lollipop3 lollipop = new HardCandy_Lollipop3();
            hardCandyPackage.add(lollipop);
        }

        System.out.println("One package of " + quantity + " hard candy has been made!");
        return hardCandyPackage;

    }
}
