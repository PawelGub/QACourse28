package org.example;
import java.time.LocalDate;

public class Товар {
    private String name;
    private LocalDate manufactureDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean isReserved;
    public Товар(String name, LocalDate manufactureDate, String manufacturer, String countryOfOrigin, double price, boolean isReserved) {
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + manufactureDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Забронировано: " + (isReserved ? "Да" : "Нет"));
    }
}
