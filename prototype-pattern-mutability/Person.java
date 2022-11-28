
public class Person implements Cloneable{

	
	private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
  @Override
  public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
      
  }

}
