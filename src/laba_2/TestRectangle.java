package laba_2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestRectangle {
    @Test
    public void testRectangleCreation() {
        Rectangle rectangle = new Rectangle(5, 10);

        assertEquals(5.0, rectangle.getLength());
        assertEquals(10.0, rectangle.getWidth());
    }

    @Test
    public void testSetAndGetMethods() {
        Rectangle rectangle = new Rectangle(3, 7);

        rectangle.setLength(10);
        assertEquals(10.0, rectangle.getLength());

        rectangle.setWidth(15);
        assertEquals(15.0, rectangle.getWidth());
    }

    @Test
    public void testIllegalArgumentsException() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 0));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 10));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, -2));
    }

    @Test
    public void testAreaCalculation() {
        Rectangle rectangle = new Rectangle(6, 8);

        assertEquals(48.0, rectangle.getArea());
    }

    @Test
    public void testPerimeterCalculation() {
        Rectangle rectangle = new Rectangle(12, 5);

        assertEquals(34.0, rectangle.getPerimeter());
    }

    @Test
    public void testToStringMethod() {
        Rectangle rectangle = new Rectangle(7, 14);

        String expectedString = "Rectangle{length=7.0, width=14.0, area=98.0, perimeter=42.0}";
        assertEquals(expectedString, rectangle.toString());
    }
}
