import java.util.Scanner;
public class Petshop extends Animal {

	Animal[] animalArray = new Animal[4];
	int animalAmount = 0;

	public Petshop() {

	}

	public void finalize() throws Throwable {

	}

	public void addAnimal(Animal animal) {
		animalArray[animalAmount] = animal;
		animalAmount++;
	}

	public String feedAnimal(String nombre) {
		for (int i = 0; i < animalArray.length; i++){
			Animal currentAnimal = animalArray[i];
			String currentAnimalName = currentAnimal.getName();
			if (currentAnimalName.equals(nombre)) {
				return (currentAnimalName + " esta comiendo.");
			}
		}
		return "No se pudo encontrar al animal mencionado";
	}

	public void listAnimals() {
		for(int i = 0; i < animalArray.length;i++){
			System.out.println(animalArray[i].toString());
		}
	}

	public void sellAnimal(String nombre) {
		for (int i = 0; i < animalArray.length; i++) {
			Animal currentAnimal = animalArray[i];
			String currentAnimalName = currentAnimal.getName();
			if (currentAnimalName.equals(nombre)) {
				for (int j = i; j < animalArray.length - 1; j++) {
					animalArray[j] = animalArray[j + 1];
				}
				animalArray[animalArray.length - 1] = null;
				System.out.println(currentAnimalName + " fue vendido.");
				return;
			}
		}
		System.out.println("No se pudo encontrar el animal mencionado");
	}

}
