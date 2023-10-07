import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Engine V8 = new Engine(5000, 15);
        Engine V5 = new Engine(15000, 200);

        Driver Ivan = new Driver("Иванов Иван Иванович", 45, 15);
        Driver Anton = new Driver("Антонов Антон Антонович", 20, 5);

        Lorry lorry = new Lorry("FORD", "LORRY", 500, Ivan, V8, 450);
        SportCar sportCar = new SportCar("FORMULA1", "SPORT", 200, Anton, V5, 350);

        lorry.start();
        lorry.stop();
        lorry.turnLeft();
        lorry.turnRight();

        sportCar.start();
        sportCar.stop();
        sportCar.turnLeft();
        sportCar.turnRight();

    }
}
