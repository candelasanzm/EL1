package SOO5.Interfaces;
import SOO5.Interfaces.Clases.Animal;
import SOO5.Interfaces.Clases.Cat;
import SOO5.Interfaces.Clases.Dog;
import SOO5.Interfaces.Clases.BigDog;

public class MainAnimalCatDogBigDog {
    public static void main(String[] args){
        Animal a1 = new Cat("gato");
        System.out.println(a1);

        Animal a2 = new Dog("Ona");
        System.out.println(a2);

        Dog d1 = new BigDog("Thor");
        System.out.println(d1);
    }
}
