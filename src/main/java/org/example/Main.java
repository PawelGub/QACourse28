package org.example;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Первое задание
        Товар Товар1 = new Товар("Смартфон", LocalDate.of(2024, 3, 1), "Samsung", "Южная Корея", 84499.99, true);
        Товар1.printInfo();

        System.out.println("\n2 задание. Массив:\n"); // Второе задание: Объявляем массив товаров

        Товар[] productsArray = new Товар[5];

        // Для каждой ячейки массива задаем объект
        productsArray[0] = new Товар("Samsung S25 Ultra", LocalDate.of(2025, 2, 1), "Samsung Corp.", "Korea", 125999.0, true);
        productsArray[1] = new Товар("iPhone 15 Pro", LocalDate.of(2024, 9, 22), "Apple Inc.", "USA", 119999.99, false);
        productsArray[2] = new Товар("PlayStation 5", LocalDate.of(2024, 5, 15), "Sony", "Japan", 79900.50, true);
        productsArray[3] = new Товар("Xiaomi Vacuum Cleaner", LocalDate.of(2024, 5, 10), "Xiaomi", "China", 12299.0, false);
        productsArray[4] = new Товар("Dell XPS 17", LocalDate.of(2023, 11, 30), "Dell", "USA", 198899.99, true);

        // Выводим информацию о каждом товаре
        for (Товар product : productsArray) {
            product.printInfo();
            System.out.println("_____________");
        }
        System.out.println("\n3 задание. Аттракционы:\n");
        Park.Attraction[] AttractionArray = new Park.Attraction[5]; // Третье задание: Объявляем массив аттракционов
        AttractionArray[0] = new Park.Attraction("Катапульта", "Взрослый", 1299.0, "9:30-19:30");
        AttractionArray[1] = new Park.Attraction("Сомбреро", "Детский", 599.50, "9:00-19:00");
        AttractionArray[2] = new Park.Attraction("Горка Большая", "Взрослый", 999.00, "10:00-19:50");
        AttractionArray[3] = new Park.Attraction("Горка Детская", "Детский", 399.00, "10:00-19:50");
        AttractionArray[4] = new Park.Attraction("Карусель", "Детский", 600.00, "9:00-19:50");
        for (Park.Attraction Attraction : AttractionArray){
            Attraction.printInfo();
            System.out.println("_____________");
        }
    }
}
