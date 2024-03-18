package laba_2;

public class TestGeometricShapes {
    public static void main(String[] args) {
        // Создаем объекты для каждой из фигур и вычисляем их площадь и периметр
        GeometricShapes.Circle circle = new GeometricShapes.Circle(5);
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Периметр круга: " + circle.calculatePerimeter());

        GeometricShapes.Square square = new GeometricShapes.Square(4);
        System.out.println("Площадь квадрата: " + square.calculateArea());
        System.out.println("Периметр квадрата: " + square.calculatePerimeter());

        GeometricShapes.Triangle triangle = new GeometricShapes.Triangle(3, 4, 5);
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
    }
}
