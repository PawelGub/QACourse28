package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик");
        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Мурзик", 15),
                new Cat("Васька", 20),
                new Cat("Снежок", 8),
                new Cat("Том", 12)
        };

        dog.run(150);
        dog.swim(10);
        cats[1].run(100);
        cats[1].swim(5); // не умеет

        FoodBowl bowl = new FoodBowl(20);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }
        System.out.println("\nСтатус котов:");
        for (Cat cat : cats) {
            System.out.println("Кот " + cat.getName() + ", аппетит: " + cat.getAppetite() + ", сыт: " + cat.isFull());
        }

        System.out.println("\nПополняем миску...");
        bowl.addFood(20);

        bowl.printStatus();

        System.out.println("Котов создано: " + Cat.getCount());
        System.out.println("Собак создано: " + Dog.getCount());
        System.out.println("Всего животных: " + Животное.getCount());
    }
}
