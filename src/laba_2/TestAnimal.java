package laba_2;

public class TestAnimal {
    public static void main(String[] args) {
        // Создание объектов для каждого из подклассов и вызов их методов
        Dog dog = new Dog("Шарик", 5, "Овчарка");
        dog.makeSound();

        Cat cat = new Cat("Мурка", 3, "Сухой корм");
        cat.makeSound();

        Bird bird = new Bird("Чижик", 2, true);
        bird.makeSound();
    }
}
