
public abstract class AbstractVehicle implements Vehicle {

    // Абстрактный класс для автомобилей - применение принципа подстановки Барбары Лисков (LSP)
    private String model;
    private double price;

    public AbstractVehicle(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                "\n Модель=" + model +
                        "\n Цена=" + price + " - руб";
    }
}
