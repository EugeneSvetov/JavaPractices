import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        pets.put("Tom", new Cat( 3, "Siamese"));
        pets.put("Max", new Dog( 5, "Labrador"));
        pets.put("Charlie", new Parrot( 2, "African Grey"));
        printKeys(pets);
    }
    public static void printKeys(Map<String, Pet> map) {
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
}