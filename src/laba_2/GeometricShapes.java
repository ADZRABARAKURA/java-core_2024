package laba_2;
import java.util.Scanner;
public class GeometricShapes {
    // Интерфейс для геометрических фигур
    interface Shape {
        double calculateArea(); // Метод для вычисления площади
        double calculatePerimeter(); // Метод для вычисления периметра
    }

    // Класс Круг
    static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    // Класс Квадрат
    static class Square implements Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            return side * side;
        }

        @Override
        public double calculatePerimeter() {
            return 4 * side;
        }
    }

    // Класс Треугольник
    static class Triangle implements Shape {
        private double side1;
        private double side2;
        private double side3;

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        @Override
        public double calculateArea() {
            // Используем формулу Герона для вычисления площади треугольника
            double semiPerimeter = (side1 + side2 + side3) / 2;
            return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        }

        @Override
        public double calculatePerimeter() {
            return side1 + side2 + side3;
        }
    }

}
