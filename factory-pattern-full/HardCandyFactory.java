import java.util.ArrayList;

public class HardCandyFactory extends CandyFactory3{

	@Override
    public Candy3 getCandy(String type) {
        switch (type) {
            case "candycane":
                return new HardCandy_CandyCane3();
            case "lollipop":
                return new HardCandy_Lollipop3();
            case "peppermint":
                return new HardCandy_Peppermint3();
            default:
                return new HardCandy_CandyCane3();
        }

    }

    @Override
    public ArrayList getCandyPackage(int quantity, String type) {
        Candy3 candy = getCandy(type);
        if(quantity % 10 != 0) {
            System.out.println("Hard candy must be packaged in multiples of 10.");
            return null;
        }
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }

}
