
public class PrintSpooler2 {
	
private static final PrintSpooler2 spooler = new PrintSpooler2();
    
    private static boolean initialized = false;
    
    private PrintSpooler2(){}
    
    private void init() {
        // Code to initialize our printer spooler goes here
    }
    
    public static synchronized PrintSpooler2 getInstance() {
        
        if(initialized) return spooler;
        spooler.init();
        initialized = true;
        return spooler;
                
    }            

}
