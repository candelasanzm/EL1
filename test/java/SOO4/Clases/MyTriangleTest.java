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
        MyPoint v1 = new MyPoint(1, 2);
        MyPoint v2 = new MyPoint(5, 7);
        MyPoint v3 = new MyPoint(4, 1);
        MyTriangle t1 = new MyTriangle(v1, v2, v3);
        MyTriangle t2 = new MyTriangle(1, 0, 5, 7, 4, 1);
        assertEquals(15.6481, t1.getPerimeter());
        assertEquals(15.6481, t2.getPerimeter());

    }

    @Test
    void getType() {
        MyPoint v1 = new MyPoint(1, 2);
        MyPoint v2 = new MyPoint(5, 7);
        MyPoint v3 = new MyPoint(4, 1);
        MyTriangle t1 = new MyTriangle(v1, v2, v3);
        assertEquals("Escaleno", t1.getType());
    }
}