public class Animal {

	private int age;
	private String name;
	private double price;
	private String typeAnimal;

	public Animal(){

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(int age, String name, double price, String typeAnimal){
		this.age = age;
		this.name = name;
		this.price = price;
		this.typeAnimal = typeAnimal;
	}

	public void finalize() throws Throwable {

	}

	@Override
	public String toString(){
		return (this.name + " es un " + this.typeAnimal + " de " + this.age + " años, cuesta " + this.price + " pesos.");
	}

}