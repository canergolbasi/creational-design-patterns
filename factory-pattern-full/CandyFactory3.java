import java.util.ArrayList;

public abstract class CandyFactory3 {

	public abstract Candy3 getCandy(String type);

    public ArrayList getCandyPackage(int quantity, String type) {
        Candy3 candy = getCandy(type);
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }
}
