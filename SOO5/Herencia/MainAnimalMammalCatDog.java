package SOO5.Herencia;

import SOO5.Herencia.Clases.Animal;
import SOO5.Herencia.Clases.Mammal;
import SOO5.Herencia.Clases.Cat;
import SOO5.Herencia.Clases.Dog;

public class MainAnimalMammalCatDog {
    public static void main(String[] args){
        //Datos
        Animal a1 = new Animal("Lúa");
        Mammal m1 = new Mammal("Lúa");
        Cat c1 = new Cat("Lúa");
        Dog d1 = new Dog("Lúa");
        //Imprimir los datos
        System.out.println(a1.toString());
        System.out.println(m1.toString());
        System.out.println(c1.toString());
        System.out.println(d1.toString());
    }
}
