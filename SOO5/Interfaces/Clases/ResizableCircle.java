package SOO5.Interfaces.Clases;

public class ResizableCircle extends Circle3 implements Resizable{
    public ResizableCircle (double radius){
        super(radius);
    }
    @Override
    public String toString(){
        return "ResizableCircle [" + super.toString() + "]";
    }

    @Override
    public void resize(int percent) {
        radius *= percent/100;
    }
}
