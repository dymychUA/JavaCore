package lesson10.HomeWork;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Оля", "Днепр", "Женский");
        Customer customer2 = new Customer("Света", "Харьков", "Женский");
        Customer customer3 = new Customer("Таня", "Херсон", "Женский");
        Customer customer4 = new Customer("Женя", "Киев", "Мужской");
        Customer customer5 = new Customer("Вася", "Одесса", "Мужской");
        Customer customer6 = new Customer("Игорь", "Львов", "Мужской");

        ElectronicsOrder eOrder1 = new ElectronicsOrder("HP Probook H1", new Date(), "Киев", "Днепр", 15000, customer1, 12);
        ElectronicsOrder eOrder2 = new ElectronicsOrder("Asus Zenbook 13", new Date(), "Киев", "Харьков", 12000, customer2, 12);

        FurnitureOrder fOrder1 = new FurnitureOrder("Shlak 1", new Date(), "Львов", "Одесса", 1500, customer5, "AA090");
        FurnitureOrder fOrder2 = new FurnitureOrder("Shlak 2", new Date(), "Львов", "Львов", 200, customer6, "GP830");

        Order[] orders = {eOrder1, eOrder2, fOrder1, fOrder2};
        for (Order order : orders) {
            order.calculatePrice();
            order.validateOrder();
            order.confirmShipping();
        }
    }
}
