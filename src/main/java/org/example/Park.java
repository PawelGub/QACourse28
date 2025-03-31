package org.example;

public class Park {
    public static class Attraction {
        private String name;
        private String type;
        private double ticketPrice;
        private String workingHours;

        public Attraction(String name, String type, double ticketPrice, String workingHours) {
            this.name = name;
            this.type = type;
            this.ticketPrice = ticketPrice;
            this.workingHours = workingHours;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Тип: " + type);
            System.out.println("Цена билета: " + ticketPrice + " руб.");
            System.out.println("Часы работы: " + workingHours);
        }
    }
}
