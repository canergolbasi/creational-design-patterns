import java.util.Collections;
import java.util.List;

public class ResourceManager3 {
	
	public ResourceManager3() {
    }

    public static void main(String[] args) {
        
        PrintSpooler3 spooler = new PrintSpooler3();

        List<PrintSpooler3> spoolers = Collections.singletonList(spooler);

        processResources(spoolers);
        
        PrintSpooler3 spooler2 = new PrintSpooler3();
        spoolers.add(spooler2);  
                        

    }

    /**
     * A method that takes a list of printers as a parameter
     */
    public static <Type> void processResources(List<Type> list) {

        for (Type p : list) {
            //Code to process resources
        }

    }

}
