package SOO5.Herencia.Clases;

public class Mammal extends Animal{
    public Mammal (String name){
        super(name);
    }
    @Override
    public String toString(){
        return "Mammal [ " + super.toString() + "]";
    }
}
