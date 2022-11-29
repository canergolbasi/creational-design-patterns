
public class ChocolateFactory3 extends CandyFactory3 {

	 @Override
	    public Candy3 getCandy(String section) {
	        switch (section) {
	            case "dark":
	                return new Chocolate_dark3();
	            case "white":
	                return new Chocolate_white3();
	            case "milk":
	                return new Chocolate_milk3();
	            default:
	                return new Chocolate_milk3();
	        }
	    }
}
