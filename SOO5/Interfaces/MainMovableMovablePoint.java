package SOO5.Interfaces;

import SOO5.Interfaces.Clases.Movable;
import SOO5.Interfaces.Clases.MovablePoint;

public class MainMovableMovablePoint {
    public static void main(String [] args){
        Movable m1 = new MovablePoint(2, 1, 1, 4);
        System.out.println(m1);
        System.out.println(m1.moveUp());
        System.out.println(m1.moveDown());
        System.out.println(m1.moveLeft());
        System.out.println(m1.moveRigth());

        MovablePoint mp1 = (MovablePoint)m1;
        System.out.println(mp1);
        System.out.println(mp1.moveUp());
        System.out.println(mp1.moveDown());
        System.out.println(mp1.moveLeft());
        System.out.println(mp1.moveRigth());
    }
}
