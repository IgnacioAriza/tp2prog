public class Fish extends Animal {

	private boolean saltWater;
	private String species;

	public Fish(){

	}

	public Fish(boolean saltWater, String species,int age, String name, double price, String typeAnimal){
		super(age,name,price,typeAnimal);
		this.saltWater = saltWater;
		this.species = species;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}