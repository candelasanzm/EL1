package SOO5.Herencia.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D p3D1 = new Point3D(0, 0, 0);
        assertEquals(0, p3D1.getZ());
    }

    @Test
    void setZ() {
        Point3D p3D1 = new Point3D(0, 0, 0);
        p3D1.setZ(0);
        assertEquals(0, p3D1.getZ());
    }

    @Test
    void setXYZ() {
        Point3D p3D1 = new Point3D(0, 0, 0);
        p3D1.setXYZ(0,0,0);
        float [] esp = new float[] {0, 0, 0};
        assertArrayEquals(esp, p3D1.getXYZ());
    }

    @Test
    void getXYZ() {
        Point3D p3D1 = new Point3D(0, 0, 0);
        float [] esp = new float[] {0, 0, 0};
        assertArrayEquals(esp, p3D1.getXYZ());
    }

    @Test
    void testToString() {
        Point2D p2D1 = new Point2D(0, 0);
        Point3D p3D1 = new Point3D(0, 0, 0);
        assertEquals("(" + p2D1 + ", " + 0.0 + ")", p3D1.toString());
    }
}