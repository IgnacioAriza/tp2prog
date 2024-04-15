public class Dog extends Animal {

	private String breed;
	private boolean vaccinated;

	public Dog(){

	}

	public Dog(String breed,boolean vaccinated,int age, String name, double price, String typeAnimal){
		super(age,name,price,typeAnimal);
		this.breed = breed;
		this.vaccinated = vaccinated;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}