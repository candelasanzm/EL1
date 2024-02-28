package SOO4.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import SOO4.Clases.MyPoint;

class MyLineTest {

    @Test
    void getBegin() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(3, 1);
        MyLine l1 = new MyLine(begin, end);
        assertEquals(begin, l1.getBegin());
    }

    @Test
    void setBegin() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(3, 1);
        MyLine l1 = new MyLine(begin, end);
        l1.setBegin(begin);
        assertEquals(begin, l1.getBegin());
    }

    @Test
    void getEnd() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(3, 1);
        MyLine l1 = new MyLine(begin, end);
        assertEquals(end, l1.getEnd());
    }

    @Test
    void setEnd() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(3, 1);
        MyLine l1 = new MyLine(begin, end);
        l1.setEnd(end);
        assertEquals(end, l1.getEnd());
    }

    @Test
    void getBeginX() {
        MyLine l1 = new MyLine(1, 2, 3, 4);
        assertEquals(1, l1.getBeginX());
    }

    @Test
    void setBeginX() {
        MyLine l1 = new MyLine(1, 2, 3, 4);
        l1.setBeginX(1);
        assertEquals(1, l1.getBeginX());
    }

    @Test
    void getBeginY() {
        MyLine l1 = new MyLine(1, 2, 3, 4);
        assertEquals(2, l1.getBeginY());
    }

    @Test
    void setBeginY() {
        MyLine l1 = new MyLine(1, 2, 3, 4);
        l1.setBeginY(2);
        assertEquals(2, l1.getBeginY());
    }

    @Test
    void getEndX() {
        MyLine l1 = new MyLine(1, 2, 3, 4);
        assertEquals(3, l1.getEndX());
    }

    @Test
    void setEndX() {
        MyLine l1 = new MyLine(1, 2, 3, 4);
        l1.setEndX(3);
        assertEquals(3, l1.getEndX());
    }

    @Test
    void getEndY() {
        MyLine l1 = new MyLine(1, 2, 3, 4);
        assertEquals(4, l1.getEndY());
    }

    @Test
    void setEndY() {
        MyLine l1 = new MyLine(1, 2, 3, 4);
        l1.setEndY(4);
        assertEquals(4, l1.getEndY());
    }

    @Test
    void getBeginXY() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(3, 1);
        MyLine l1 = new MyLine(begin, end);
        int [] esp = new int[] {2,1};
        assertArrayEquals(esp, l1.getBeginXY());
    }

    @Test
    void setBeginXY() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(3, 1);
        MyLine l1 = new MyLine(begin, end);
        l1.setBeginXY(2,1);
        int [] esp = new int[] {2,1};
        assertArrayEquals(esp, l1.getBeginXY());;
    }

    @Test
    void getEndXY() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(3, 1);
        MyLine l1 = new MyLine(begin, end);
        int [] esp = new int[] {4,3};
        assertArrayEquals(esp, l1.getEndXY());
    }

    @Test
    void setEndXY() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(3, 1);
        MyLine l1 = new MyLine(begin, end);
        l1.setEndXY(4,3);
        int [] esp = new int[] {4,3};
        assertArrayEquals(esp, l1.getEndXY());
    }

    @Test
    void getLength() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(3, 1);
        MyLine l1 = new MyLine(begin, end);
        assertEquals(Math.sqrt(5), l1.getLength());
    }

    @Test
    void getGradien() {
        MyLine l1 = new MyLine(1, 2, 3, 4);
        int xDiff = (int) Math.atan2(2);
        int yDiff = (int) Math.atan2(2);
        int [] Diff = new int [] {yDiff, xDiff};
        assertArrayEquals(Diff, l1.getGradien()); 
    }

    @Test
    void testToString() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(3, 1);
        MyLine l1 = new MyLine(begin, end);
        assertEquals("MyLine[begin = (" + begin + "), end = (" + end + ")]", l1.toString());
    }
}