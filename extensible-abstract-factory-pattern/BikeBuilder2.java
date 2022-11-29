
public class BikeBuilder2 {

public static void main(String[] args) {        
        
        createBikeWithExtensibleAbstractFactory("road bike");
        
    }   
    
    public static void createBikeWithExtensibleAbstractFactory(String type) {
        
        BikeFactory2 bikeFactory = FactoryCreator2.createFactory(type); 
        Tire2 tireFront = (Tire2) bikeFactory.create("tire");
        tireFront.getDescription();
        Tire2 tireBack = (Tire2) bikeFactory.create("tire");
        tireBack.getDescription();
        Handlebar2 handlebar = (Handlebar2) bikeFactory.create("handlebar");
        handlebar.getDescription();
        
    }
}
