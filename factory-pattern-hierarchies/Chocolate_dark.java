import java.util.ArrayList;

public class Chocolate_dark extends Candy2 {

	 @Override
	    ArrayList<Candy2> makeCandyPackage(int quantity) {
	        ArrayList chocolatePackage = new ArrayList<>();
	        for (int i = 1; i <= quantity; i++) {
	            Chocolate_dark chocolate = new Chocolate_dark();
	            chocolatePackage.add(chocolate);
	        }

	        System.out.println("One package of " + quantity + " dark chocolates has been made!");
	        return chocolatePackage;

	    }
}
