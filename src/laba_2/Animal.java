package laba_2;

public class  Animal {
    // Поля, общие для всех животных
    private String name;
    private int age;

    // Конструктор
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для издания звука
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

// Подклассы, наследующие класс Animal

// Класс Dog (собака)
class Dog extends Animal {
    // Уникальные поля для собаки
    private String breed;

    // Конструктор
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Переопределение метода для издания звука
    @Override
    public void makeSound() {
        System.out.println("Собака издает лай");
    }
}

// Класс Cat (кошка)
class Cat extends Animal {
    // Уникальные поля для кошки
    private String foodType;

    // Конструктор
    public Cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }

    // Переопределение метода для издания звука
    @Override
    public void makeSound() {
        System.out.println("Кошка издает мяуканье");
    }
}

// Класс Bird (птица)
class Bird extends Animal {
    // Уникальные поля для птицы
    private boolean canFly;

    // Конструктор
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    // Переопределение метода для издания звука
    @Override
    public void makeSound() {
        System.out.println("Птица издает пение");
    }
}
