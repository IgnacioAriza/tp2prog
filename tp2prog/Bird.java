public class Bird extends Animal {

	private boolean speaks;
	private String species;

	public Bird(){

	}

	public Bird(boolean speaks, String species,int age, String name, double price, String typeAnimal){
		super(age,name,price,typeAnimal);
		this.speaks = speaks;
		this.species = species;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}