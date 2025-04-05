package org.example;

public class Shapes {

    // Абстрактный класс Фигура
    abstract static class Shape {
        private String fillColor;
        private String borderColor;

        public Shape(String fillColor, String borderColor) {
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }

        abstract double getArea();
        abstract double getPerimeter();

        public String getFillColor() {
            return fillColor;
        }

        public void setFillColor(String fillColor) {
            this.fillColor = fillColor;
        }

        public String getBorderColor() {
            return borderColor;
        }

        public void setBorderColor(String borderColor) {
            this.borderColor = borderColor;
        }
    }

    // Круг
    static class Circle extends Shape {
        private double radius;

        public Circle(double radius, String fillColor, String borderColor) {
            super(fillColor, borderColor);
            this.radius = radius;
        }

        @Override
        double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString() {
            return "Круг (радиус = " + radius + ")";
        }
    }

    // Прямоугольник
    static class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height, String fillColor, String borderColor) {
            super(fillColor, borderColor);
            this.width = width;
            this.height = height;
        }

        @Override
        double getArea() {
            return width * height;
        }

        @Override
        double getPerimeter() {
            return 2 * (width + height);
        }

        @Override
        public String toString() {
            return "Прямоугольник (" + width + " x " + height + ")";
        }
    }

    // Треугольник
    static class Triangle extends Shape {
        private double a, b, c;

        public Triangle(double a, double b, double c, String fillColor, String borderColor) {
            super(fillColor, borderColor);
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        double getArea() {
            double p = getPerimeter() / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Формула Герона
        }

        @Override
        double getPerimeter() {
            return a + b + c;
        }

        @Override
        public String toString() {
            return "Треугольник (" + a + ", " + b + ", " + c + ")";
        }
    }

    // Метод запуска
    public static void run() {
        Shape[] shapes = new Shape[] {
                new Circle(5, "Жёлтый", "Чёрный"),
                new Rectangle(4, 6, "Синий", "Белый"),
                new Triangle(3, 4, 5, "Красный", "Зелёный")
        };

        System.out.println("Фигуры и их параметры:");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println("Цвет фона: " + shape.getFillColor());
            System.out.println("Цвет границы: " + shape.getBorderColor());
            System.out.printf("Площадь: %.2f\n", shape.getArea());;
            System.out.printf("Периметр: %.2f\n", shape.getPerimeter());
            System.out.println();
        }
    }
}
