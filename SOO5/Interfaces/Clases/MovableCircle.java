package SOO5.Interfaces.Clases;

public class MovableCircle extends MovablePoint2 implements Movable2{
    private int radius;
    private MovablePoint2 center;
    public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius){
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public String toString(){
        return super.toString() + ", radius = " + radius;
    }

    @Override
    public void moveUp() {
        super.moveUp();
    }

    @Override
    public void moveDown() {
        super.moveDown();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    @Override
    public void moveRigth() {
        super.moveRigth();
    }
}
