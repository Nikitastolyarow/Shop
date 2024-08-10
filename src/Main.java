
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CarStore carStore = new CarStore();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            carStore.displayCar(); // Показываем доступные автомобили
            System.out.println("Введите номер автомобиля для покупки или 'end' для выхода:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break; // Завершение программы
            }

            try {
                int choice = Integer.parseInt(input) - 1; // Получаем номер автомобиля
                Vehicle vehicle = carStore.buyCar(choice);
                if (vehicle != null) {
                    System.out.println("Вы купили: " + vehicle);
                } else {
                    System.out.println("Некорректный выбор. Пожалуйста, попробуйте снова.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите число или 'end'.");
            }
        }

        System.out.println("Спасибо за покупку!");
        scanner.close();
    }

}
