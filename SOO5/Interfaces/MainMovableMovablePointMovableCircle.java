package SOO5.Interfaces;

import SOO5.Interfaces.Clases.Movable2;
import SOO5.Interfaces.Clases.MovableCircle;
import SOO5.Interfaces.Clases.MovablePoint2;

public class MainMovableMovablePoint {
    public static void main(String [] args){
        Movable2 m1 = new MovablePoint2(2, 1, 1, 4);
        System.out.println(m1);
        System.out.println(m1.moveUp());
        System.out.println(m1.moveDown());
        System.out.println(m1.moveLeft());
        System.out.println(m1.moveRigth());

        MovablePoint2 mp1 = (MovablePoint2)m1;
        System.out.println(mp1);
        System.out.println(mp1.moveUp());
        System.out.println(mp1.moveDown());
        System.out.println(mp1.moveLeft());
        System.out.println(mp1.moveRigth());

        Movable2 m2 = new MovableCircle(2, 1, 1, 4, 1);
        System.out.println(m2);
        System.out.println(m2.moveUp());
        System.out.println(m2.moveDown());
        System.out.println(m2.moveLeft());
        System.out.println(m2.moveRigth());

        MovableCircle mc1 = (MovableCircle)m2;
        System.out.println(mc1);
        System.out.println(mc1.moveUp());
        System.out.println(mc1.moveDown());
        System.out.println(mc1.moveLeft());
        System.out.println(mc1.moveRigth());
    }
}
