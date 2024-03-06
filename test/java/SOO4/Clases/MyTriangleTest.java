package SOO4.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyPoint v1 = new MyPoint(1, 2);
        MyPoint v2 = new MyPoint(5, 7);
        MyPoint v3 = new MyPoint(4, 1);
        MyTriangle t1 = new MyTriangle(v1, v2, v3);
        assertEquals("MyTriangle[v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3 + "]", t1.toString());
    }

    @Test
    void getPerimeter() {
        MyPoint v1 = new MyPoint(3, 4);
        MyPoint v2 = new MyPoint(5, 7);
        MyPoint v3 = new MyPoint(4, 1);
        MyTriangle t1 = new MyTriangle(v1, v2, v3);
        MyTriangle t2 = new MyTriangle(1, 0, 5, 7, 4, 1);
        assertEquals(12.850591465930588, t1.getPerimeter());
        assertEquals(17.30729793876515, t2.getPerimeter());

    }

    @Test
    void getType() {
        MyTriangle t = new MyTriangle(4, 0, 0, 0, 2, 3);
        MyTriangle t2 = new MyTriangle(0, 2, -2, -1, 2, -1);
        MyPoint v1 = new MyPoint();
        MyPoint v2 = new MyPoint(6, 0);
        MyPoint v3 = new MyPoint(3, 5);
        MyTriangle t1 = new MyTriangle(v1, v2, v3);
        assertDoesNotThrow(()-> t.getType());
        assertDoesNotThrow(()-> t1.getType());
        assertEquals("Escaleno", t.getType());
        assertEquals("Equilátero", t1.getType());
        assertEquals("Isósceles", t2.getType());
    }
}