package SOO5.Interfaces.Clases;

public class MovablePoint2 implements Movable2{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint2 (int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "(" + x + ", " + y + "), speed = (" + xSpeed + ", " + ySpeed + ")";
    }
    public void moveUp(){
        y -= ySpeed;
    }
    public void moveDown(){
        y += ySpeed;
    }
    public void moveLeft(){
        x -= xSpeed;
    }
    public void moveRigth(){
        x += xSpeed;
    }
}
