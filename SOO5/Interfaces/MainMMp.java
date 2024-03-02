package SOO5.Interfaces;

import SOO5.Interfaces.Clases.Movable;
import SOO5.Interfaces.Clases.MovablePoint;

public class MainMMp {
    public static void main(String [] args){
        Movable m1 = new MovablePoint(2, 1, 1, 4);
        System.out.println(m1);
        m1.moveUp();
        m1.moveDown();
        m1.moveLeft();
        m1.moveRigth();

        MovablePoint mp1 = (MovablePoint)m1;
        System.out.println(mp1);
        mp1.moveUp();
        mp1.moveDown();
        mp1.moveLeft();
        mp1.moveRigth();
    }
}
