package org.example;

abstract class Животное {
    protected String name;
    protected static int count = 0;

    public Животное(String name) {
        this.name = name;
        count++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }

    public static int getCount() {
        return count;
    }
}

class Dog extends Животное {
    private static int dogCount = 0;
    private final int MAX_RUN = 500;
    private final int MAX_SWIM = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать больше " + MAX_RUN + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM) {
            super.swim(distance);
        } else {
            System.out.println(name + " не может проплыть больше " + MAX_SWIM + " м.");
        }
    }

    public static int getCount() {
        return dogCount;
    }
}

class Cat extends Животное {
    private static int catCount = 0;
    private final int MAX_RUN = 200;
    private boolean isFull = false;
    private int appetite;

    public Cat(String name, int appetite) {
        super(name);
        catCount++;
        this.appetite = appetite;
    }
    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFull() {
        return isFull;
    }
    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать больше " + MAX_RUN + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(FoodBowl bowl) {
        if (isFull) {
            System.out.println(name + " сыт и не ест.");
            return;
        }

        if (bowl.decreaseFood(appetite)) {
            isFull = true;
            System.out.println(name + " поел и сыт.");
        } else {
            System.out.println(name + " не хватило еды.");
        }
    }

    public static int getCount() {
        return catCount;
    }
}

class FoodBowl {
    private int foodAmount;

    public FoodBowl(int foodAmount) {
        this.foodAmount = Math.max(foodAmount, 0);
    }

    public boolean decreaseFood(int amount) {
        if (amount <= foodAmount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавлено " + amount + " еды в миску.");
        }
    }

    public void printStatus() {
        System.out.println("Осталось еды в миске: " + foodAmount);
    }
}
