import com.hospital.Vet;
import com.zoo.Animal;
import com.zoo.Bear;
import com.zoo.Cat;
import com.zoo.Dog;


public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Bear("Михаил"),
                new Cat("Буся"),
                new Dog("Джек")
        };

        Vet vet = new Vet();

        for (Animal animal: animals) {
            vet.treatAnimal(animal);
        }

        System.out.println();

        for (Animal animal: animals) {
            animal.makeNoise();
            animal.eat();
            System.out.println();
        }

    }
}
