public class Cat extends Animal {

	private String breed;
	private boolean sterilized;

	public Cat(){

	}

	public Cat(String breed, boolean sterilized,int age, String name, double price, String typeAnimal){
		super(age,name,price,typeAnimal);
		this.breed = breed;
		this.sterilized = sterilized;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}