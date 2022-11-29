import java.util.ArrayList;

public class HardCandy_CandyCane3 extends Candy3{

	@Override
    ArrayList<Candy3> makeCandyPackage(int quantity) {                              
        
        ArrayList hardCandyPackage = new ArrayList<>();                                  
 
        for(int i = 1; i <= quantity; i++) {
            HardCandy_CandyCane3 candyCane = new HardCandy_CandyCane3();
            hardCandyPackage.add(candyCane);
        }

        System.out.println(quantity / 10 + " packages of 10 candy canes have been made!");         
        return hardCandyPackage;

    }
}
