import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sca = new Scanner(System.in);
        Petshop petshop = new Petshop();

        Cat cat = new Cat("esfinge",true,2,"Bingus",2000,"gato");
        Bird bird = new Bird(true, "cuervo", 2, "Quothe", 3000,"pajaro");
        Dog dog = new Dog("labrador", true,5,"Solly",6500,"perro");
        Fish fish = new Fish(true,"barracuda", 4,"Filo",18000,"pez");

        petshop.addAnimal(cat);
        petshop.addAnimal(dog);
        petshop.addAnimal(fish);
        petshop.addAnimal(bird);
        petshop.listAnimals();

        System.out.println("Escriba el nombre del animal que desea alimentar (Recuerde la primera letra mayuscula): ");
        System.out.println(petshop.feedAnimal(sca.nextLine()));
        System.out.println("Escriba el nombre del animal que esta siendo vendido: ");
        petshop.sellAnimal(sca.nextLine());

    }
}
