
public class ResourceManager2 {

	public static void main(String[] args) {            

        PrintSpooler2 spooler = PrintSpooler2.getInstance();
        
        // First thread        
        Thread threadOne = new Thread(() -> {PrintSpooler2 s = PrintSpooler2.getInstance();});
        
        // Second thread
        Thread threadTwo = new Thread(() -> {PrintSpooler2 s = PrintSpooler2.getInstance();});
        
        threadOne.start();        
        threadTwo.start();                            

    }
}
