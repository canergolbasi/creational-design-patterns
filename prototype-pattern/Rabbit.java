
public class Rabbit implements Cloneable {
	
	public Rabbit()  {
    }
	
	@Override
    public Rabbit clone() throws CloneNotSupportedException  {

		return (Rabbit) super.clone();
			 

    }

	 public enum Breed {
	       XXXXX
	    }

	    private int age;
	    private Breed breed;

	    

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
