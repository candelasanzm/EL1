package SOO5.Interfaces.Clases;

public class Dog extends Animal{
    public Dog (String name){
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("Meow");
    }
    public void greets(Dog another){
        System.out.println("Woooof");
    }
}
