package SOO5.Interfaces.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {

    @Test
    void testToString() {
        GeometricObject2 g21 = new Circle3(1);
        Resizable r1 = new ResizableCircle(1);
        assertEquals("ResizableCircle [" + g21 + "]", r1.toString());
    }

    @Test
    void resize() {
        int porcentaje = 20;
        Resizable r1 = new ResizableCircle(1);
        r1.resize(porcentaje);
        assertEquals(20/100, r1.resize());
    }
}