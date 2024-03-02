package SOO5.Interfaces.Clases;

public abstract class Animal {
    private String name;
    public Animal (String name){
        this.name = name;
    }
    abstract void greets();
}
