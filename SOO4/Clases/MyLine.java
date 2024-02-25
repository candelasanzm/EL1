package SOO4.Clases;
import SOO4.Clases.MyPoint;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    public MyLine (int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX(){

    }
    public void setBeginX(int x){
        this.x = x;
    }
    public int getBeginY(){

    }
    public void setBeginY(){

    }
    public int getEndX(){

    }
    public void setEndX(){

    }
    public int getEndY(){

    }
    public void setEndY(){

    }
    public int getBeginXY(){

    }
    public void setBeginXY(int x, int y){

    }
    public int getEndXY(){

    }
    public void setEndXY(int x, int y){

    }
    public double getLength(){

    }
    public double getGradien(){
        return Math.atan2(yDiff, xDiff);
    }
    public String toString(){
        return "MyLine[begin = (" + x1 + ", " + y1 + "), end = (" + x2 + ", " + y2 + ")]";
    }
}
