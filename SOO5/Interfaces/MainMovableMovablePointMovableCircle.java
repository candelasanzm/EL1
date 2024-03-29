package SOO5.Interfaces;

import SOO5.Interfaces.Clases.Movable2;
import SOO5.Interfaces.Clases.MovableCircle;
import SOO5.Interfaces.Clases.MovablePoint2;

public class MainMovableMovablePointMovableCircle {
    public static void main(String [] args){
        Movable2 m1 = new MovablePoint2(2, 1, 1, 4);
        System.out.println(m1);
        m1.moveUp();
        m1.moveDown();
        m1.moveLeft();
        m1.moveRigth();

        MovablePoint2 mp1 = (MovablePoint2)m1;
        System.out.println(mp1);
        mp1.moveUp();
        mp1.moveDown();
        mp1.moveLeft();
        mp1.moveRigth();

        Movable2 m2 = new MovableCircle(2, 1, 1, 4, 1);
        System.out.println(m2);
        m2.moveUp();
        m2.moveDown();
        m2.moveLeft();
        m2.moveRigth();

        MovableCircle mc1 = (MovableCircle)m2;
        System.out.println(mc1);
        mc1.moveUp();
        mc1.moveDown();
        mc1.moveLeft();
        mc1.moveRigth();
    }
}
