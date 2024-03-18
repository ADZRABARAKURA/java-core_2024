package laba_2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestPerson {
    @Test
    public void testPersonCreation() {
        Person person = new Person("Иван", 30, "мужчина");

        assertEquals("Иван", person.getName());
        assertEquals(30, person.getAge());
        assertEquals("мужчина", person.getGender());
    }
    @Test
    public void testSetAndGetMethods() {
        Person person = new Person("Петр", 25, "женщина");

        person.setName("Анна");
        assertEquals("Анна", person.getName());

        person.setAge(40);
        assertEquals(40, person.getAge());

        person.setGender("мужчина");
        assertEquals("мужчина", person.getGender());
    }
    @Test
    public void testToStringMethod() {
        Person person = new Person("Мария", 20, "женщина");

        String expectedString = "Person{name='Мария', age=20, gender='женщина'}";
        assertEquals(expectedString, person.toString());
    }
}
