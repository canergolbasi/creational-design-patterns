import java.util.ArrayList;

public class Chocolate_dark3 extends Candy3 {

	@Override
    ArrayList<Candy3> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            Chocolate_dark chocolate = new Chocolate_dark();
            chocolatePackage.add(chocolate);
        }

        System.out.println("One package of " + quantity + " dark chocolates has been made!");
        return chocolatePackage;

    }
}
