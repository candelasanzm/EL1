package SOO4.Clases;
import SOO4.Clases.MyPoint;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;
    public MyCircle(){
    }
    public MyCircle (int x, int y, int radius){
        this.center.setX(x);
        this.center.setY(y);
        this.radius = radius;
    }
    public MyCircle (MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public MyPoint getCenter() {
        return center;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX(){
        return this.center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return this.center.getY();
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public int[] getCenterXY(){
        return this.center.getXY();
    }
    public void setCenterXY(int x, int y){
        this.center.setXY(x, y);
    }
    public String toString(){
        return "MyCircle[radius = " + radius + ", center = " + center + "]";
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public double distance (MyCircle another){
        return center.distance(another.getCenter());
    }
}
