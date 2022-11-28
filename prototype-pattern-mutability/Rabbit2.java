
public class Rabbit2 implements Cloneable {

	
	@Override
    public Rabbit2 clone() throws CloneNotSupportedException {
        Rabbit2 rabbit = (Rabbit2) super.clone();
        rabbit.owner = owner.clone();
        return rabbit;
        
    }
	public Rabbit2() {        
    }
	
	 public enum Breed {
		 XXXXX
	    }

	    private int age;
	    private Breed breed;
	    private Person owner;

	    
	    

	    
	    public void setOwner(String name) {
	        Person owner = new Person(name);
	        this.owner = owner;
	    }

	    public Person getOwner() {
	        return owner;
	    }
	    
	        public void setAge(int age) {
	        this.age = age;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setBreed(Breed breed) {
	        this.breed = breed;
	    }

	    public Breed getBreed() {
	        return breed;
	    }

	    
	    
	    
}
