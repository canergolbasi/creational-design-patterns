
public class CandyStore2 {

	private static final CandyFactory2 candyFactory = new CandyFactory2();    

    public static void main(String[] args) {      
        candyFactory.getCandyPackage(12, "white", "chocolate");
        candyFactory.getCandyPackage(7, "dark", "chocolate");   
        candyFactory.getCandyPackage(14, "lollipop", "hard candy");
        candyFactory.getCandyPackage(20, "peppermint", "hard candy");
    }
}
