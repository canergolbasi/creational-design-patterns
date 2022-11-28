
public class Main2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		 Rabbit2 rabbit = new Rabbit2();
	        rabbit.setOwner("Sally");
	        Rabbit2 rabbitCopy = rabbit.clone();
	        System.out.println("Name of first owner " + rabbit.getOwner().getName());
	        System.out.println("Name of first owner " + rabbitCopy.getOwner().getName());        
	        rabbitCopy.getOwner().setName("Steve");
	        System.out.println(rabbit.getOwner().getName());
	        System.out.println(rabbitCopy.getOwner().getName());

	}

}
