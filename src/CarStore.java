import java.util.ArrayList;

// DRY (Don't Repeat Yourself)
public class CarStore {


    private ArrayList<Vehicle> car;

    public CarStore() {
        car = new ArrayList<>();
        car.add((new Sedan()));
        car.add((new Crossover()));
        car.add((new Hatchback()));
        car.add((new Lorry()));
    }

    public void displayCar() {
        System.out.println("Доступные автомобили:");
        for (int i = 0; i < car.size(); i++) {
            System.out.println((i + 1) + " " + car.get(i));
        }
    }
    // Принцип открытости/закрытости (OCP) - класс может расширяться новыми функциями без изменения существующих
    public Vehicle buyCar(int index) {
        if (index >= 0 && index < car.size()) {
            return car.remove(index);
        }
        return null;
    }
}
