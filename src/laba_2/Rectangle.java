package laba_2;

public class Rectangle {

    private double length;
    private double width;

    // Конструктор
    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Длина и ширина должны быть больше 0");
        }
        this.length = length;
        this.width = width;
    }

    // Геттеры
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Сеттеры
    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Длина должна быть больше 0");
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Ширина должна быть больше 0");
        }
        this.width = width;
    }

    // Вычисление площади
    public double getArea() {
        return length * width;
    }

    // Вычисление периметра
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Метод toString()
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}